package com.example.a1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Link : TextView = findViewById(R.id.lnk)
        Link.movementMethod = LinkMovementMethod.getInstance()
        Link.setTextColor(Color.DKGRAY)
    }
}