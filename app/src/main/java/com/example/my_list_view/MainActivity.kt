package com.example.my_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listView=findViewById<ListView>(R.id.listView)
        val nchi= arrayOf("kenya","tanzania","uganda","ethiopia","rwanda")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,nchi)
        listView.adapter=arrayAdapter

        listView.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"you have clicked on" +nchi[position],Toast.LENGTH_LONG).show()


        }

    }
}