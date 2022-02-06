package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
//        val name = intent.getStringExtra("NAME")
//        val age = intent.getIntExtra("AGE", 0)
//        val country = intent.getStringExtra("COUNTRY")
//
//        tv.text =name + age + country
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        tvResult.text = person.toString()
    }
}

