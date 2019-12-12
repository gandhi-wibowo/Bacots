package com.dizcoding.bacots

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_chat, menu)
        return super.onCreateOptionsMenu(menu)
    }

/*    override fun onOptionsItemSelected(item: MenuItem): Boolean {
*//*        when (item.itemId) {
            R.id.searchMenu -> startActivity(intentFor<Pencarian>())
            R.id.favorit -> startActivity(intentFor<Favorit>())
        }*//*
        return super.onOptionsItemSelected(item)
    }*/
}
