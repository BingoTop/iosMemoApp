package com.example.memomvvm.view.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0014\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 J\u0014\u0010!\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/memomvvm/view/activities/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "arrList", "Ljava/util/ArrayList;", "Lcom/example/memomvvm/db/MemoEntity;", "getArrList", "()Ljava/util/ArrayList;", "displayList", "getDisplayList", "viewModel", "Lcom/example/memomvvm/viewmodel/MainViewModel;", "memoClickListener", "", "memoEntity", "memoLongClickListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setCountText", "memoList", "", "setRecyclerView", "app_debug"})
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "\uc11c\uce58 \uc561\ud2f0\ube44\ud2f0 - ";
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.memomvvm.db.MemoEntity> displayList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.memomvvm.db.MemoEntity> arrList = null;
    private com.example.memomvvm.viewmodel.MainViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.memomvvm.db.MemoEntity> getDisplayList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.memomvvm.db.MemoEntity> getArrList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void memoClickListener(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.db.MemoEntity memoEntity) {
    }
    
    public final void memoLongClickListener(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.db.MemoEntity memoEntity) {
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> memoList) {
    }
    
    public final void setCountText(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> memoList) {
    }
    
    public SearchActivity() {
        super();
    }
}