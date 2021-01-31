package com.example.memomvvm.view.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.memomvvm.R
import com.example.memomvvm.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.memo_write.*

class CreateMemoActivity:AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    var finishChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.memo_write)
        setSupportActionBar(detail_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onPause() {
        super.onPause()
        if(finishChecked == false){
            val text = writing_memo.text.toString()
            viewModel.insert(text)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.otherBtn -> {
                Log.d("메모 생성 액티비티 - ","공유하기 버튼 클릭")
                val textMessage = writing_memo.text.toString()
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT,textMessage)
                    type = "text/plain"
                }
                if(sendIntent.resolveActivity(packageManager) != null){
                    startActivity(sendIntent)
                }
                return true
                }
            R.id.finishBtn ->{
                val intent = Intent(this,MainActivity::class.java)
                val text = writing_memo.text.toString()
                if(text != "") {
                    viewModel.insert(text)
                    finishChecked = true
                }
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
        }
    }
