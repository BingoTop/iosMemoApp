package com.example.memomvvm.view.activities.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeRecyclerView
import com.ernestoyaquello.dragdropswiperecyclerview.listener.OnItemDragListener
import com.ernestoyaquello.dragdropswiperecyclerview.listener.OnItemSwipeListener
import com.example.memomvvm.R
import com.example.memomvvm.db.MemoEntity
import com.example.memomvvm.view.activities.MainActivity
import com.example.memomvvm.view.adapter.MemoAdapter
import com.example.memomvvm.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.linear_fragment.*


class LinearFragment : Fragment(){
    private lateinit var memoList: LiveData<List<MemoEntity>>
    private lateinit var viewModel: MainViewModel
    private lateinit var list:DragDropSwipeRecyclerView
    val TAG = "리니어 프래그먼트 - "

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = activity
        val view = inflater.inflate(R.layout.linear_fragment, container, false)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val adapter = MemoAdapter(viewModel.getList(), { memoEntity -> })
        list = view.findViewById(R.id.list)
        list.adapter = adapter
        list.swipeListener = onItemSwipeListener
        list.dragListener = onItemDragListener
        list.behindSwipedItemIconDrawableId = R.drawable.ic_baseline_delete_24
        list.layoutManager = LinearLayoutManager(context)
        list.behindSwipedItemBackgroundColor = ContextCompat.getColor(context!!, R.color.red)
        list.behindSwipedItemIconMargin = 50.0F
        memoList = viewModel.getAll()
        memoList.observe(viewLifecycleOwner, {
            adapter.setMemos(it)
            (activity as MainActivity?)?.memoSizeChange(it.size)
        })
        return view
    }

    private val onItemSwipeListener = object : OnItemSwipeListener<MemoEntity> {
        override fun onItemSwiped(
            position: Int,
            direction: OnItemSwipeListener.SwipeDirection,
            item: MemoEntity
        ): Boolean {
            viewModel.deleteMemo(viewModel.getList()[position])
            return false
        }
    }
    private val onItemDragListener = object : OnItemDragListener<MemoEntity> {
        override fun onItemDragged(previousPosition: Int, newPosition: Int, item: MemoEntity) {
        }

        override fun onItemDropped(initialPosition: Int, finalPosition: Int, item: MemoEntity) {
            // Handle action of item dropped
//            val toast = Toast.makeText(context, "dropped!", Toast.LENGTH_SHORT)
//            toast.show()
        }
    }
}