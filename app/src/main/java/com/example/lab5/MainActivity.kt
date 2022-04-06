package com.example.lab5

import android.app.appsearch.AppSearchSchema
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl("https://www.google.com/")
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.mybutton) {
            val intent = Intent(this, ScrollViewDisplayActivity::class.java).apply {}
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    fun getHorizontalScreen(view: View) {
        val intent = Intent(this, HorizontalScreenActivity::class.java).apply {}
        startActivity(intent)
    }

    fun getListView(view: View) {
        val intent = Intent(this, ListViewActivity::class.java).apply {}
        startActivity(intent)

    }
}

