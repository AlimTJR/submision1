package com.example.submissiondic

import android.content.Intent
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
        val (name, ilmiah, detail, photo) = listHerbal[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.imgPhoto)

        val mContext = holder.itemView.context

        holder.tvName.setText(name + " (" + ilmiah + ")")
        holder.tvDetail.text = detail

        holder.itemView.setOnClickListener {
        val toDetail = Intent(mContext, DetailHerbal::class.java)
            toDetail.putExtra(DetailHerbal.EXTRA_NAMAHERBAL, name)
            toDetail.putExtra(DetailHerbal.EXTRA_NAMAILMIAH, ilmiah)
            toDetail.putExtra(DetailHerbal.EXTRA_DETAIL, detail)
            toDetail.putExtra(DetailHerbal.EXTRA_PHOTO, photo)
            mContext.startActivity(toDetail)
        }
    }
}
