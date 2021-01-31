package com.example.memomvvm.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface MemoDao {

    @Query("SELECT * from memo_table")
    fun getAllMemos(): LiveData<List<MemoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMemo(memoEntity: MemoEntity)

    @Update
    suspend fun updateMemo(memoEntity: MemoEntity)

    @Delete
    suspend fun deleteMemo(memoEntity: MemoEntity)

    @Query("SELECT * FROM memo_table where id=:id")
    suspend fun getMemo(id:Int) :MemoEntity?

    @Query("SELECT `desc` from memo_table")
    suspend fun getList(): List<String>

    @Query("SELECT * from memo_table")
    suspend fun getMutableList(): MutableList<MemoEntity>


    @Query("SELECT * from memo_table")
    suspend fun getMemoList(): List<MemoEntity>
//    @Query("SELECT `desc` from memo_table")
//    suspend fun getMemoStringArrayList(): ArrayList<String>

    @Query("DELETE FROM memo_table")
    suspend fun deleteAllMemos()


}