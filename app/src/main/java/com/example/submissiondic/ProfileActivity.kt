package com.example.submissiondic

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ProfileActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_ALAMAT = "extra_alamat"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_INSTAGRAM = "extra_instagram"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val tvdatanama: TextView = findViewById(R.id.tv_nama)
        val tvdatamail: TextView = findViewById(R.id.tv_email)
        val tvdataalamat: TextView = findViewById(R.id.tvalamat)
        val tvdataphone: TextView = findViewById(R.id.tvphone)
        tvdataphone.setOnClickListener(this)
        val tvinstagram: TextView = findViewById(R.id.tv_instagram)
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val alamat =intent.getStringExtra(EXTRA_ALAMAT)
        val phone=intent.getStringExtra(EXTRA_PHONE)
        val instagram=intent.getStringExtra(EXTRA_INSTAGRAM)
        tvdatanama.text= nama
        tvdatamail.text= email
        tvdataalamat.text=alamat
        tvinstagram.text=instagram
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.tvphone ->{
                val phoneNumber = "085601919056"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}