package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView


class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val arrayAdapter:ArrayAdapter<*>

        val cars = mutableListOf("S60","V60","S90","V90","C40 Recharge","XC40 Recharge","XC40")
        val listView1 = findViewById<ListView>(R.id.listView1)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,cars)
        listView1.adapter = arrayAdapter


    }
}