package com.example.submissiondic

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_herbal.*
import kotlinx.android.synthetic.main.activity_profile.*


class DetailHerbal : AppCompatActivity() , View.OnClickListener {
    companion object{
        const val EXTRA_NAMAHERBAL="extra_namaherbal"
        const val EXTRA_NAMAILMIAH="extra_namailmiah"
        const val EXTRA_DETAIL="extra_detail"
        const val EXTRA_PHOTO= "photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_herbal)
        val ivPhoto: ImageView = findViewById(R.id.image_detail)
        val namaherbal: TextView= findViewById(R.id.nama_detail)
        val ilmiahDetail: TextView= findViewById(R.id.ilmiah_detail)
        val deskripsiDetail: TextView = findViewById(R.id.text_detail)
        val btnTonton: Button = findViewById(R.id.tonton)
        btnTonton.setOnClickListener(this)

        val imPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tvName = intent.getStringExtra(EXTRA_NAMAHERBAL)
        val tvIlmiah = intent.getStringExtra(EXTRA_NAMAILMIAH)
        val tvDetail = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(imPhoto)
            .apply(RequestOptions())
            .into(ivPhoto)
        namaherbal.text = tvName
        ilmiahDetail.text = tvIlmiah
        deskripsiDetail.text = tvDetail
    }

    override fun onClick(v: View) {
        val queryvalue = intent.getStringExtra(EXTRA_NAMAHERBAL)
        when (v.id){
            R.id.tonton->{
                val intent = Intent(Intent.ACTION_SEARCH)
                intent.setPackage("com.google.android.youtube")
                intent.putExtra("query", queryvalue)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }
        }
    }
}