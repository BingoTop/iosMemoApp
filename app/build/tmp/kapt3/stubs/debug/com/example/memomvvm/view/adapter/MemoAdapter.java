package com.example.memomvvm.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0014\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/memomvvm/view/adapter/MemoAdapter;", "Lcom/ernestoyaquello/dragdropswiperecyclerview/DragDropSwipeAdapter;", "Lcom/example/memomvvm/db/MemoEntity;", "Lcom/example/memomvvm/view/adapter/MemoAdapter$MemoViewHolder;", "dataSet", "", "setOnClickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "memoItems", "getSetOnClickListener", "()Lkotlin/jvm/functions/Function1;", "getViewHolder", "itemView", "Landroid/view/View;", "getViewToTouchToStartDraggingItem", "item", "viewHolder", "position", "", "onBindViewHolder", "setMemos", "memos", "MemoViewHolder", "app_debug"})
public final class MemoAdapter extends com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeAdapter<com.example.memomvvm.db.MemoEntity, com.example.memomvvm.view.adapter.MemoAdapter.MemoViewHolder> {
    private java.util.List<com.example.memomvvm.db.MemoEntity> memoItems;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.memomvvm.db.MemoEntity, kotlin.Unit> setOnClickListener = null;
    
    public final void setMemos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> memos) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.view.View getViewToTouchToStartDraggingItem(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.db.MemoEntity item, @org.jetbrains.annotations.NotNull()
    com.example.memomvvm.view.adapter.MemoAdapter.MemoViewHolder viewHolder, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.memomvvm.view.adapter.MemoAdapter.MemoViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.db.MemoEntity item, @org.jetbrains.annotations.NotNull()
    com.example.memomvvm.view.adapter.MemoAdapter.MemoViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.memomvvm.db.MemoEntity, kotlin.Unit> getSetOnClickListener() {
        return null;
    }
    
    public MemoAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> dataSet, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.memomvvm.db.MemoEntity, kotlin.Unit> setOnClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/memomvvm/view/adapter/MemoAdapter$MemoViewHolder;", "Lcom/ernestoyaquello/dragdropswiperecyclerview/DragDropSwipeAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "created_at", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getCreated_at", "()Landroid/widget/TextView;", "setCreated_at", "(Landroid/widget/TextView;)V", "dragIcon", "Landroid/widget/ImageView;", "getDragIcon", "()Landroid/widget/ImageView;", "memo_id", "getMemo_id", "root", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "setRoot", "(Landroid/widget/LinearLayout;)V", "text_memo", "getText_memo", "setText_memo", "app_debug"})
    public static final class MemoViewHolder extends com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeAdapter.ViewHolder {
        private android.widget.TextView text_memo;
        private android.widget.TextView created_at;
        private final android.widget.TextView memo_id = null;
        private android.widget.LinearLayout root;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView dragIcon = null;
        
        public final android.widget.TextView getText_memo() {
            return null;
        }
        
        public final void setText_memo(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getCreated_at() {
            return null;
        }
        
        public final void setCreated_at(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getMemo_id() {
            return null;
        }
        
        public final android.widget.LinearLayout getRoot() {
            return null;
        }
        
        public final void setRoot(android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDragIcon() {
            return null;
        }
        
        public MemoViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}