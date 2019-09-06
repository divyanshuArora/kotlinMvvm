package com.example.mvvmkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.BR
import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.databinding.ActivityRegisterBinding
import com.example.mvvmkotlin.model.User
import com.example.mvvmkotlin.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_register.*
import android.widget.Toast




class Register : AppCompatActivity()
{

   var  registerBinding : ActivityRegisterBinding ?= null
    val user= User()
    val userViewModel= UserViewModel(user)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register)
        registerBinding = DataBindingUtil.setContentView(this,R.layout.activity_register)
        registerBinding?.setVariable(BR.registerModel,userViewModel)


    }




}
