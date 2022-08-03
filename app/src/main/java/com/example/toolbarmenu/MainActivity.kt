package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_tool_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.misearch -> Toast.makeText(this,"This is search Icon",Toast.LENGTH_SHORT).show()
            R.id.misettings -> Toast.makeText(this,"This is settings Icon",Toast.LENGTH_SHORT).show()
            R.id.mifavorite -> Toast.makeText(this,"This is favorite Icon",Toast.LENGTH_SHORT).show()
            R.id.micloseApp -> finish()
        }
        return true
    }
}