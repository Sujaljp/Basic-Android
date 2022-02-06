package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf<Todo>(
            Todo("First Task",false),

        )
        val adapter = TodoAdapter(todoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAdd.setOnClickListener{
            val newTodo = Todo(etTodo.text.toString(), false)
            todoList.add(newTodo)

            //not efficient as reloads all
            // adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(todoList.size-1)
            val a = ""
            etTodo.setText(a)
            etTodo.setEnabled(false)
            etTodo.setEnabled(true)
        }

    }
}