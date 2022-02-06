package com.example.alertgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Builder is a very common in and studio
        // dialog
        //here we are creating the variable for alert dialog
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Me in your contacts")
            .setIcon(R.drawable.ic_add_contact)
            //setPositive dismisses the dialog for us
            //the function like below is called a lander function and
            // if we don't need some arguments the we can just us _ underscore
                                // dialogInterface, i ->
            .setPositiveButton("Yes") {_,_ ->
                Toast.makeText(this, "You added Me", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this, "You didn't added Me", Toast.LENGTH_SHORT).show()
            }.create() //before we add .create we just created from builder but no Alert dialog object was created
        btn1.setOnClickListener{
            addContactDialog.show()
        }
        val option = arrayOf("First","Second","Third","Fourth")
        val checkboxDial = AlertDialog.Builder(this)
            .setTitle("Single Choice")
            .setSingleChoiceItems(option,0){_,_ ->
                Toast.makeText(this,"ONE MORE",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){_,_->
                Toast.makeText(this,"Accepted",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this,"Declined",Toast.LENGTH_SHORT).show()
            }.create()
        btn2.setOnClickListener{
            checkboxDial.show()
        }
        val multecheckbox = AlertDialog.Builder(this)
            .setTitle("Multe Checkbox")
            .setMultiChoiceItems(option, booleanArrayOf(false,false,false,false)){_,i,isChecked->
                if (isChecked){
                    Toast.makeText(this,"You checked ${option[i]}",Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this,"You unchecked ${option[i]}",Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept"){_,_->
                Toast.makeText(this,"Accepted",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this,"Declined",Toast.LENGTH_SHORT).show()
            }.create()
        btn3.setOnClickListener{
            multecheckbox.show()
        }
    }
}