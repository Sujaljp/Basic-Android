package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(){
            val name = nameI.text.toString()
            val intent = Intent(this,CardActivity::class.java)
//            intent.putExtra("name", name)
            intent.putExtra(CardActivity.NAME_EXTRA, name)
            Toast.makeText(this, "Name was collected $name", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}