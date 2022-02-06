package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener(){
            val a = etFirst.text.toString().toInt()
            val b = etSecond.text.toString().toInt()
            val ans = a+b
            result.text = ans.toString()
        }
        btnSub.setOnClickListener{
            val a = etFirst.text.toString().toInt()
            val b = etSecond.text.toString().toInt()
            var ans = a-b
            result.text = ans.toString()
        }
        btnMultiply.setOnClickListener{
            val a = etFirst.text.toString().toInt()
            val b = etSecond.text.toString().toInt()
            var ans = a*b
            result.text = ans.toString()
        }
        btnDivide.setOnClickListener{
            val a = etFirst.text.toString().toInt()
            val b = etSecond.text.toString().toInt()
            var ans = a/b
            result.text= ans.toString()
        }
    }
}