package com.example.memomvvm.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0014\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/example/memomvvm/view/adapter/SearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/memomvvm/view/adapter/SearchAdapter$MemoViewHolder;", "memoItems", "", "Lcom/example/memomvvm/db/MemoEntity;", "memoItemClick", "Lkotlin/Function1;", "", "memoItemLongClick", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getMemoItemClick", "()Lkotlin/jvm/functions/Function1;", "getMemoItemLongClick", "getMemoItems", "()Ljava/util/List;", "setMemoItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMemos", "memos", "MemoViewHolder", "app_debug"})
public final class SearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.memomvvm.view.adapter.SearchAdapter.MemoViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.memomvvm.db.MemoEntity> memoItems;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.memomvvm.db.MemoEntity, kotlin.Unit> memoItemClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.memomvvm.db.MemoEntity, kotlin.Unit> memoItemLongClick = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.memomvvm.view.adapter.SearchAdapter.MemoViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.memomvvm.view.adapter.SearchAdapter.MemoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setMemos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> memos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.memomvvm.db.MemoEntity> getMemoItems() {
        return null;
    }
    
    public final void setMemoItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.memomvvm.db.MemoEntity, kotlin.Unit> getMemoItemClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.memomvvm.db.MemoEntity, kotlin.Unit> getMemoItemLongClick() {
        return null;
    }
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.memomvvm.db.MemoEntity> memoItems, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.memomvvm.db.MemoEntity, kotlin.Unit> memoItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.memomvvm.db.MemoEntity, kotlin.Unit> memoItemLongClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/memomvvm/view/adapter/SearchAdapter$MemoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/memomvvm/view/adapter/SearchAdapter;Landroid/view/View;)V", "created_at", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getCreated_at", "()Landroid/widget/TextView;", "setCreated_at", "(Landroid/widget/TextView;)V", "memo_id", "getMemo_id", "root", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "setRoot", "(Landroid/widget/LinearLayout;)V", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "text_memo", "getText_memo", "setText_memo", "bind", "", "memoObject", "Lcom/example/memomvvm/db/MemoEntity;", "app_debug"})
    public final class MemoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView text_memo;
        private android.widget.TextView created_at;
        private final android.widget.TextView memo_id = null;
        private android.widget.LinearLayout root;
        @org.jetbrains.annotations.NotNull()
        private final java.text.SimpleDateFormat sdf = null;
        
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
        public final java.text.SimpleDateFormat getSdf() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.memomvvm.db.MemoEntity memoObject) {
        }
        
        public MemoViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}