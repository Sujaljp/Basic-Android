package com.example.implicitintents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it,0)
            }
        }
    }
    // here the resultCode is returned by other app
    //requestCode is defined by us to differentiate
    //data is the intent send from other app it can be nullable
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode==Activity.RESULT_OK && requestCode==0){
            //as the intent data is nullable we need to use ?
            //the other data is the data inside data? it returns a URI (a link)
            val uri = data?.data
            imageView.setImageURI(uri)
        }
    }
}