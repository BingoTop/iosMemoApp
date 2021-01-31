package com.example.memomvvm.view.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.memomvvm.R
import com.example.memomvvm.db.MemoEntity
import com.example.memomvvm.view.adapter.SearchAdapter
import com.example.memomvvm.view.dialog.CustomDialog
import com.example.memomvvm.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.memo_search.*
import kotlinx.coroutines.runBlocking
import java.util.*
import kotlin.collections.ArrayList

class SearchActivity:AppCompatActivity() {
    val TAG = "서치 액티비티 - "
    val displayList = ArrayList<MemoEntity>()
    val arrList = ArrayList<MemoEntity>()
    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.memo_search)
        setSupportActionBar(search_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.getList().forEach {
            arrList.add(it)
        }
        displayList.addAll(arrList)
        val adapter = SearchAdapter(displayList,{memo->
            memoClickListener(memo)
        },{memo->
            memoLongClickListener(memo)
        })
        search_recycle.adapter = adapter
        search_recycle.layoutManager = LinearLayoutManager(this)
        search_recycle.setHasFixedSize(true)

        setRecyclerView(displayList)
        setCountText(displayList)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        val menuItem = menu!!.findItem(R.id.search)

        if(menuItem!= null){
            val searchView = menuItem.actionView as androidx.appcompat.widget.SearchView
            searchView.setOnQueryTextListener(object:androidx.appcompat.widget.SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }
                override fun onQueryTextChange(newText: String?): Boolean {
                    if(newText!!.isNotEmpty()){
                        runBlocking {
                            displayList.clear()
                        }
                        val search = newText.toLowerCase(Locale.getDefault())
                        arrList.forEach{
                            if (it.desc?.toLowerCase(Locale.getDefault())!!.contains(search)){
                                displayList.add(it)
                            }
                        }
                        setCountText(displayList)
                    }
                    else{
                        displayList.clear()
                        displayList.addAll(arrList)
                        setCountText(displayList)
                    }
                    return true
                }
            })
        }

        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.search_cancle -> {
                val intent = Intent(this, MainActivity::class.java)
                this.startActivity(intent)
            }
            else -> {
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun memoClickListener(memoEntity: MemoEntity){
        val intent = Intent(this, DetailMemoActivity::class.java)
        intent.putExtra("memo_id", memoEntity.id.toString())
        intent.putExtra("memo_desc", memoEntity.desc)
        this.startActivity(intent)
    }

    fun memoLongClickListener(memoEntity: MemoEntity){
        CustomDialog(this)
            .setTitle("")
            .setMessage("메모를 삭제하시겠습니까?")
            .setPositiveButton("닫기") {
            }.setNegativeButton("삭제") {
                viewModel.deleteMemo(memoEntity)
                displayList.remove(memoEntity)
                setRecyclerView(displayList)
                setCountText(displayList)
            }.show()
    }
    fun setRecyclerView(memoList:List<MemoEntity>){
        search_recycle.adapter = SearchAdapter(memoList,{memo->memoClickListener(memo)},{memo->memoLongClickListener(memo)})
    }
    fun setCountText(memoList: List<MemoEntity>){
        search_item_count.text = "${memoList.size}개 발견됨"
        search_recycle.adapter!!.notifyDataSetChanged()
    }
}