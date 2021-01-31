package com.example.memomvvm.view.activities.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/memomvvm/view/activities/fragments/LinearFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "list", "Lcom/ernestoyaquello/dragdropswiperecyclerview/DragDropSwipeRecyclerView;", "memoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/memomvvm/db/MemoEntity;", "onItemDragListener", "Lcom/ernestoyaquello/dragdropswiperecyclerview/listener/OnItemDragListener;", "onItemSwipeListener", "Lcom/ernestoyaquello/dragdropswiperecyclerview/listener/OnItemSwipeListener;", "viewModel", "Lcom/example/memomvvm/viewmodel/MainViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class LinearFragment extends androidx.fragment.app.Fragment {
    private androidx.lifecycle.LiveData<java.util.List<com.example.memomvvm.db.MemoEntity>> memoList;
    private com.example.memomvvm.viewmodel.MainViewModel viewModel;
    private com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeRecyclerView list;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "\ub9ac\ub2c8\uc5b4 \ud504\ub798\uadf8\uba3c\ud2b8 - ";
    private final com.ernestoyaquello.dragdropswiperecyclerview.listener.OnItemSwipeListener<com.example.memomvvm.db.MemoEntity> onItemSwipeListener = null;
    private final com.ernestoyaquello.dragdropswiperecyclerview.listener.OnItemDragListener<com.example.memomvvm.db.MemoEntity> onItemDragListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public LinearFragment() {
        super();
    }
}