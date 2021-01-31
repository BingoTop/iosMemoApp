package com.example.memomvvm.view.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.GridLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColor
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeRecyclerView
import com.ernestoyaquello.dragdropswiperecyclerview.listener.OnItemDragListener
import com.ernestoyaquello.dragdropswiperecyclerview.listener.OnItemSwipeListener
import com.example.memomvvm.R
import com.example.memomvvm.viewmodel.MainViewModel
import com.example.memomvvm.db.MemoEntity
import com.example.memomvvm.view.activities.fragments.GridFragment
import com.example.memomvvm.view.activities.fragments.LinearFragment
import com.example.memomvvm.view.adapter.MemoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.memo_search.*
import kotlinx.android.synthetic.main.memo_write.*
import kotlinx.android.synthetic.main.view_layout.*

class MainActivity : AppCompatActivity() {
    var LAYOUT_VALUE = ""
    val TAG = "메인액티비티 - "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadData()
        setContentView(R.layout.activity_main)
        setSupportActionBar(main_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        val pref = getSharedPreferences("pref",0)
        val layoutval = pref.getString("layout",LAYOUT_VALUE)// 두번째 인자 디폴트 값
        Log.d(TAG,layoutval.toString())
        if (layoutval == "GRID"){
            setFrag(1)
        }else{
            setFrag(0)
        }
        // 버튼 클릭 리스너
        search_view.setOnClickListener{
            val intent = Intent(this,SearchActivity::class.java)
            this.startActivity(intent)
        }
        button_add.setOnClickListener {
            val intent = Intent(this,CreateMemoActivity::class.java)
            this.startActivity(intent)
        }
    }
    fun memoSizeChange(size:Int){
        memo_size_text.text = "${size}개의 메모"
    }

    private fun setFrag(fragNum: Int){
        val ft = supportFragmentManager.beginTransaction()// 화면교체
        when(fragNum){
            0 ->{
                ft.replace(R.id.main_frame,LinearFragment()).commit()
            }
            1->{
                ft.replace(R.id.main_frame,GridFragment()).commit()
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        saveData()
        Log.d(TAG,"SaveData 호출 ${LAYOUT_VALUE}")
    }
    private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        val stringData = pref.getString("layout","LINEAR")// 두번째 인자 디폴트 값
        Log.d(TAG,"LoadData 호출 ${stringData}")
    }
    private fun saveData() {
        // 0 저장옵션 보통 0으로 사용
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit() // 수정모드
        edit.putString("layout",LAYOUT_VALUE)
        edit.apply()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.otherBtn -> {
                val pref = getSharedPreferences("pref",0)
                val stringData = pref.getString("layout",LAYOUT_VALUE)// 두번째 인자 디폴트 값
                Log.d(TAG,"스트링 데이터 ${stringData}")
                val edit = pref.edit() // 수정모드
                if(stringData== "LINEAR"){
                    edit.putString("layout","GRID")
                    LAYOUT_VALUE = "GRID"
                    edit.apply()
                    setFrag(1)
                    val stringData = pref.getString("layout",LAYOUT_VALUE)// 두번째 인자 디폴트 값
                    Log.d(TAG,"툴바 버튼 클릭 GRID ->  ${LAYOUT_VALUE}로 바뀜, 결과 STRINGDATA: ${stringData}")

                }else{
                    edit.putString("layout","LINEAR")
                    LAYOUT_VALUE = "LINEAR"
                    edit.apply()
                    setFrag(0)
                    val stringData = pref.getString("layout",LAYOUT_VALUE)// 두번째 인자 디폴트 값
                    Log.d(TAG,"툴바 버튼 클릭 LINEAR -> ${LAYOUT_VALUE}로 바뀜, STRINGDATA: 결과 ${stringData}")
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}