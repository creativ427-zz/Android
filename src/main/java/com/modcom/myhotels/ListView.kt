package com.modcom.myhotels

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        //create an array of hotels
        val hotels = arrayOf("Lagos", "safari park hotel", "Kempinski", "Parkinn", "Safi Hotels", " Eron Hotel", "Radisson Blue")
        //an array adpter that will help to pass the lsit of hotels
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hotels)
        //setting the adpater on line 15 to the listview created under activity xml
        Hotels.adapter = arrayAdapter
        //add a list listener
        Hotels.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position:Int, id: Long ->
            //using the postion of the array items we set on click, count start from 0
            if (position==0){
                //intent-explicit or implicit intents
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.2818765,36.8229488z=15"))
                startActivity(i)
            }
            if (position==1){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.2255608,36.8810407z=15"))
                startActivity(i)
            }
            if (position == 2){
                val i = Intent(this, ActivityKempinski::class.java)
                startActivity(i)
            }
            //do the rest

        }
    }
}