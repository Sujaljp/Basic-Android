package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

//btnAdd.setOnClickListener {
//    val firstName = etFirstName.text.toString()
//    val lastName = etLastName.text.toString()
//    val email = etEmail.text.toString()
//    val password = etPassword.text.toString()
//
//    Log.d("Main Activity","$firstName $lastName has email address $email")
//}