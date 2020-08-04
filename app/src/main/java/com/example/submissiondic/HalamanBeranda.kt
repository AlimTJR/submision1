package com.example.submissiondic

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalamanBeranda : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvHerbal: RecyclerView
    private var list: ArrayList<Herbal> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_beranda)

        rvHerbal = findViewById(R.id.rv_herbal)
        rvHerbal.setHasFixedSize(true)

        list.addAll(HerbalData.getListData())
        showRecycleList()

    val btnProfile : ImageView = findViewById(R.id.profile_icon)
        btnProfile.setOnClickListener(this)
    }
    private fun showRecycleList(){
        rvHerbal.layoutManager = LinearLayoutManager(this)
        val listHerbalAdapter = ListHerbalAdapter(list)
        rvHerbal.adapter = listHerbalAdapter
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.profile_icon->{
                val movewithdataIntent = Intent(this@HalamanBeranda, ProfileActivity::class.java)
                movewithdataIntent.putExtra(ProfileActivity.EXTRA_NAMA, "M Alim Tajri")
                movewithdataIntent.putExtra(ProfileActivity.EXTRA_EMAIL, "muhammadalim358@gmail.com")
                movewithdataIntent.putExtra(ProfileActivity.EXTRA_ALAMAT, "Losari, Kabupaten Brebes, Jawa Tengah")
                movewithdataIntent.putExtra(ProfileActivity.EXTRA_PHONE, "+6285601919056")
                movewithdataIntent.putExtra(ProfileActivity.EXTRA_INSTAGRAM, "@alim.tjr")
                startActivity(movewithdataIntent)
            }
        }
    }
}