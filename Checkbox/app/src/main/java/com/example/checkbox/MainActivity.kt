package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
            val typeId = radioGroup.checkedRadioButtonId
            val type = findViewById<RadioButton>(typeId)
            val one = green.isChecked
            val two = brown.isChecked
            val three = spicy.isChecked
            val order = "You ordered Pani Puri with:\n"+
                    "${type.text}\n"+
                    (if (one)"\nGreen Chutney" else "")+
                    (if (two)"\nBrown Chutney" else "")+
                    (if (three)"\nSpicy Chutney" else "")
            tvOrder.text = order.toString()
        }

    }
}