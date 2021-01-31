package com.example.memomvvm.view.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeAdapter
import com.example.memomvvm.R
import com.example.memomvvm.db.MemoEntity
import com.example.memomvvm.view.activities.DetailMemoActivity
import kotlinx.android.synthetic.main.grid_item_memo.view.*
import kotlinx.android.synthetic.main.item_memo.view.*
import kotlinx.android.synthetic.main.item_memo.view.created_at
import kotlinx.android.synthetic.main.item_memo.view.drag_icon
import kotlinx.android.synthetic.main.item_memo.view.id_view
import kotlinx.android.synthetic.main.item_memo.view.item_text
import kotlinx.android.synthetic.main.item_memo.view.root
import java.text.SimpleDateFormat

class GridMemoAdapter(dataSet:List<MemoEntity>, val setOnClickListener:(MemoEntity)->Unit) :DragDropSwipeAdapter<MemoEntity,GridMemoAdapter.MemoViewHolder>(dataSet) {
    private var memoItems:List<MemoEntity> = listOf()

    class MemoViewHolder(itemView:View):DragDropSwipeAdapter.ViewHolder(itemView){
        var text_memo = itemView.item_text
        var created_at = itemView.created_at
        val memo_id = itemView.id_view
        var root = itemView.root
        val dragIcon: ImageView = itemView.drag_icon
        var text_memo2 = itemView.item_text2
    }

    fun setMemos(memos: List<MemoEntity>){
        this.memoItems = memos
        notifyDataSetChanged()
    }
    override fun getViewToTouchToStartDraggingItem(item: MemoEntity, viewHolder: GridMemoAdapter.MemoViewHolder, position: Int): View? {
        // We return the view holder's view on which the user has to touch to drag the item
        return viewHolder.dragIcon
    }

    override fun getViewHolder(itemView: View):
            MemoViewHolder = GridMemoAdapter.MemoViewHolder(itemView)

    override fun onBindViewHolder(item: MemoEntity, viewHolder: MemoViewHolder, position: Int) {
        val sdf = SimpleDateFormat("YYYY. MM .dd.")
        if(memoItems.size > 0) {
            viewHolder.text_memo2.text = item.desc
            viewHolder.text_memo.text = item.desc
            viewHolder.memo_id.text = memoItems[position].id.toString()
            viewHolder.created_at.text = sdf.format(memoItems[position].createdAt)
            viewHolder.root.setOnClickListener {
                val intent = Intent(viewHolder.root.context, DetailMemoActivity::class.java)
                intent.putExtra("memo_id", viewHolder.memo_id.text.toString())
                intent.putExtra("memo_desc", viewHolder.text_memo.text.toString())
                viewHolder.root.context.startActivity(intent)
            }
        }
    }





}

