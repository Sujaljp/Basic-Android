package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //This is a working code just commented
//      We need to create a anonymous class for that class onItemS...
//        monthSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?, //adapter view object
//                view: View?,//view
//                position: Int,// index of the selected element in array
//                id: Long // id of the selected item in array
//            ) {//      here as we are in a anonymous class so we need to specify to kotlin which this
//                Toast.makeText(this@MainActivity,
//                    "You Selected ${parent?.getItemAtPosition(position).toString()}",
//                    Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//
//            }
//        }
        // how to add entries to the spinner if we know them at run time only
        val  customList = listOf("One","Two","Three")
        //now we need to define an adapter for the list
        //as spinner is a view and adapter will adapt the array to the view
        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
        monthSpinner.adapter = adapter
        monthSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {//here as we are in a anonymous class so we need to specify to kotlin which this
                Toast.makeText(this@MainActivity,"You Selected ${parent?.getItemAtPosition(position).toString()}",Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
    }
}}