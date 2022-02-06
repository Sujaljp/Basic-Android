package com.example.intents

import java.io.Serializable

//data tells that it will only store data in it and it only has a constructor
// we need it be serializable so that we can access it
data class Person (
    val name: String,
    val age: Int,
    val country: String
    ):Serializable