package com.example.intents

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnSubmit.setOnClickListener{
            val name = etname.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            val person = Person(name,age,country)
            Intent(this, ThirdActivity::class.java).also{
//                it.putExtra("NAME", name)
//                it.putExtra("AGE", age)
//                it.putExtra("COUNTRY",country)
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}