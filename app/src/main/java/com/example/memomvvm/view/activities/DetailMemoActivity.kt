package com.example.memomvvm.view.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.memomvvm.R
import com.example.memomvvm.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.memo_write.*

class DetailMemoActivity :AppCompatActivity(){
    var finishChk = false
    private lateinit var viewModel: MainViewModel
    var TAG = "메모 디테일 액티비티 -"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"생성")
        setContentView(R.layout.memo_write)
        setSupportActionBar(detail_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        if(intent.hasExtra("memo_id")){
            Log.d("인텐트로 부터 받은 데이터 - ", intent.getStringExtra("memo_id")!!.toString())
        }
        writing_memo.setText(intent.getStringExtra("memo_desc"))
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        if (finishChk == false){
            if(intent.hasExtra("memo_id")){
                val memoObjId = intent.getStringExtra("memo_id")!!.toInt()
                Log.d(TAG,memoObjId.toString())
                val changed_text = writing_memo.text.toString()
                viewModel.updateMemo(memoObjId,changed_text)
            }
        }
        Log.d(TAG,intent.getStringExtra("memo_id")!!.toInt().toString())

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.otherBtn -> {
                Log.d("메모 디테일 액티비티 - ","공유하기 버튼 클릭")
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
                //업데이트
                val memoObjId = intent.getStringExtra("memo_id")!!.toInt()
                val changed_text = writing_memo.text.toString()
                viewModel.updateMemo(memoObjId,changed_text)
                finishChk = true
                Log.d("메모 디테일 액티비티 - ","완료 버튼 클릭")
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}