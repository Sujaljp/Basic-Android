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
    //This fun is required to add our custom menu and override the default one
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
    // we get item as a parameter depending on which item was clicked
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //when expression is used to check for which item is chosed
        //here we are checking item.itemId matches to which resource id
        // and print the toast matching to it
        when(item.itemId){
            R.id.mi_addContact -> Toast.makeText(this,"Added Contact", Toast.LENGTH_SHORT).show()
            R.id.mi_favourite -> Toast.makeText(this,"Favourite", Toast.LENGTH_SHORT).show()
            R.id.mi_settings -> Toast.makeText(this,"Settings Opened in dreams of App", Toast.LENGTH_SHORT).show()
            R.id.mi_exit -> finish()
        }
        return true
    }
}