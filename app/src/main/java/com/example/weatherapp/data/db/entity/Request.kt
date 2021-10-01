package com.example.weatherapp.data.db.entity


import com.google.gson.annotations.SerializedName

data class Request(

    val language: String?=null,
    val query: String?=null

){
    constructor(): this( null,null)
}