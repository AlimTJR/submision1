package com.example.submissiondic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHerbalAdapter(private val listHerbal: ArrayList<Herbal>): RecyclerView.Adapter<ListHerbalAdapter.ListViewHolder>() {
    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_herbal, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHerbal.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val herbal = listHerbal[position]
        Glide.with(holder.itemView.context)
            .load(herbal.photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.imgPhoto)
        holder.tvName.text = herbal.name
        holder.tvDetail.text = herbal.detail
    }
}