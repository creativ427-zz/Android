package com.modcom.myhotels

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kempinski.*

class ActivityKempinski : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kempinski)

        btnWEB.setOnClickListener {
            //implicit intent to a website
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kempinski.com/en/nairobi/hotel-villa-rosa/"))
            startActivity(i)
        }
        btnCall.setOnClickListener {
            //impilicit intent for call
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 911"))
            startActivity(i)
        }
        btnLocation.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.2714433,36.8067194z=15"))
            startActivity(i)
        }
        btnFindContacts.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"))
            startActivity(i)
        }
        btnShare.setOnClickListener {
            val i = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "I am using my Hotel find application, find us on google play etc")
                type ="text/plain"
            }
            val shareIntent = Intent.createChooser(i, null)
            startActivity(shareIntent)
        }
    }
}