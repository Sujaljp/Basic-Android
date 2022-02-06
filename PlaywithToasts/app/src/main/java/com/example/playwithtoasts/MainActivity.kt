package com.example.playwithtoasts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            //we directly called the make text fun and this was a default toast
            Toast.makeText(this, "Hello World !", Toast.LENGTH_LONG).show()

            // in this segment we first instantiated an object of toast class
            //then we user the kotlin scope fun apply() to apply the val
            //view was to show our custom view in here
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, customtoast)
                show()
            }
        }
    }
}