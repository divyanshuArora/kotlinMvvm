package com.example.mvvmkotlin.model

class contact_model()
{
    var name: String? = null
    var number: String ?= null


    fun setNames(name:String)
    {
        this.name = name
    }

    fun getNames():String
    {
        return name.toString()
    }


    fun setNumbers(number:String)
    {
        this.number = number
    }


    fun getNumbers():String
    {
        return number.toString()
    }












}