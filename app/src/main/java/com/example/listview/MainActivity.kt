package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView=findViewById<ListView>(R.id.listview)

        val names= arrayOf("Cindy","Joy","Collins","Timothy","Thayo","Kibet","Tacy","Wendo","Jamba","John")

        val arrayAdapter:ArrayAdapter<String> =
            ArrayAdapter(this,android.R.layout.simple_list_item_1,names)

        listView.adapter=arrayAdapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this,"you have clicked on"+names[position],Toast.LENGTH_LONG).show()
        }

    }
}