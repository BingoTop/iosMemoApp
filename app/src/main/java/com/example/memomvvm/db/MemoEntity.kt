package com.example.memomvvm.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "memo_table")
data class MemoEntity(
    @ColumnInfo(name="desc")
    var desc: String?,
    @ColumnInfo(name="createdAt")
    var createdAt:Long = System.currentTimeMillis()
    ){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}