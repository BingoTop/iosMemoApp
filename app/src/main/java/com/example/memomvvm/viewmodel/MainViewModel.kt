package com.example.memomvvm.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.memomvvm.db.AppDatabase
import com.example.memomvvm.db.MemoEntity
import kotlinx.coroutines.*

class MainViewModel(application: Application) :AndroidViewModel(application){
    // 직접적으로 접근할 수 없도록 private
    private val db = Room.databaseBuilder(
        application,
        AppDatabase::class.java,"memo_table"
    ).build()


    var memos: LiveData<List<MemoEntity>>
    var newMemo:String? = ""
    init{
        memos = getAll()
    }

    fun getAll(): LiveData<List<MemoEntity>> {
        return db.memoDao().getAllMemos()
    }

    fun getMutableList():MutableList<MemoEntity>{
        var ret:MutableList<MemoEntity>? = null
        runBlocking {
            val job = async { db.memoDao().getMutableList() }
            runBlocking {
                ret = job.await()
            }
        }
        return ret!!

    }


    fun getList():List<MemoEntity>{
        var ret:List<MemoEntity>? = null
        runBlocking {
            val job = async { db.memoDao().getMemoList() }
            runBlocking {
                ret = job.await()
            }
        }
        return ret!!
    }

    fun getAllString():List<String>{
        var ret:List<String>?=null

        runBlocking {
            val job = async { db.memoDao().getList() }
            runBlocking {
                ret = job.await()
            }
        }
        return ret!!
    }

    fun insert(memo: String){
        if(memo != ""){
            viewModelScope.launch(Dispatchers.IO) {
                db.memoDao().insertMemo(MemoEntity(memo))
            }
        }
    }

    fun objectInsert(memo: MemoEntity,index:Int){
        if(memo.desc != ""){
            viewModelScope.launch(Dispatchers.IO) {
                db.memoDao().insertMemo(memo)
            }
        }

    }

    fun updateMemo(id:Int,text:String) {
            viewModelScope.launch(Dispatchers.IO) {
                val memoObj = db.memoDao().getMemo(id)
                if(text != memoObj!!.desc) {
                    db.memoDao().updateMemo(memoObj!!.apply {
                        this.createdAt = System.currentTimeMillis()
                        this.desc = text
                    })
                }
            }
    }

    fun deleteMemo(memo: MemoEntity){
        viewModelScope.launch(Dispatchers.IO) {
            db.memoDao().deleteMemo(memo)
        }
    }

}