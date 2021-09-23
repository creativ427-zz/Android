package com.modcom.myhotels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnKempinski.setOnClickListener {
            //explicit intents variable for intent-links one activity to the next in the same application
            val i = Intent(this@MainActivity, ActivityKempinski::class.java)
            startActivity(i)
        }
        btnSafari.setOnClickListener {
            val i = Intent(this, ActivitySafari::class.java)
            startActivity(i)
        }
        btnLagos.setOnClickListener {
            val i = Intent(this, ListView::class.java)
            startActivity(i)
        }
    }
}