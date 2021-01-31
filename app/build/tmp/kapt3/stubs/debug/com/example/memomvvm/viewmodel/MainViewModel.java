package com.example.memomvvm.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\tJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010J\u0016\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006$"}, d2 = {"Lcom/example/memomvvm/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lcom/example/memomvvm/db/AppDatabase;", "memos", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/memomvvm/db/MemoEntity;", "getMemos", "()Landroidx/lifecycle/LiveData;", "setMemos", "(Landroidx/lifecycle/LiveData;)V", "newMemo", "", "getNewMemo", "()Ljava/lang/String;", "setNewMemo", "(Ljava/lang/String;)V", "deleteMemo", "", "memo", "getAll", "getAllString", "getList", "getMutableList", "", "insert", "objectInsert", "index", "", "updateMemo", "id", "text", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.memomvvm.db.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.memomvvm.db.MemoEntity>> memos;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String newMemo = "";
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.memomvvm.db.MemoEntity>> getMemos() {
        return null;
    }
    
    public final void setMemos(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.memomvvm.db.MemoEntity>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNewMemo() {
        return null;
    }
    
    public final void setNewMemo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.memomvvm.db.MemoEntity>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.memomvvm.db.MemoEntity> getMutableList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.memomvvm.db.MemoEntity> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllString() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String memo) {
    }
    
    public final void objectInsert(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.db.MemoEntity memo, int index) {
    }
    
    public final void updateMemo(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void deleteMemo(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.db.MemoEntity memo) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}