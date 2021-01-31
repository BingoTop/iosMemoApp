package com.example.memomvvm.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.memomvvm.R
import com.example.memomvvm.db.MemoEntity
import kotlinx.android.synthetic.main.item_memo.view.*
import java.text.SimpleDateFormat

class SearchAdapter(var memoItems: List<MemoEntity>,val memoItemClick:(MemoEntity)->Unit,val memoItemLongClick:(MemoEntity)->Unit):RecyclerView.Adapter<SearchAdapter.MemoViewHolder>() {
//    private var memoItems:List<MemoEntity> = ArrayList()

    inner class MemoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var text_memo = itemView.item_text
        var created_at = itemView.created_at
        val memo_id = itemView.id_view
        var root = itemView.root
        val sdf = SimpleDateFormat("YYYY. MM .dd.")

        fun bind(memoObject:MemoEntity){
            text_memo.text = memoObject.desc
            created_at.text = sdf.format(memoObject.createdAt)
            memo_id.text = memoObject.id.toString()

            itemView.setOnClickListener {
                memoItemClick(memoObject)
            }
            root.setOnLongClickListener{
                memoItemLongClick(memoObject)
                true
            }

        }

    }
    override fun onBindViewHolder(holder: MemoViewHolder, position: Int) {
        holder.bind(memoItems[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_memo,parent,false)
        return MemoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return memoItems.size
    }


    fun setMemos(memos:List<MemoEntity>){
        this.memoItems = memos
        notifyDataSetChanged()
    }


}