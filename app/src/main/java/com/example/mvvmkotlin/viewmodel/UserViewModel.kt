package com.example.mvvmkotlin.viewmodel

import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableBoolean
import androidx.databinding.library.baseAdapters.BR
import com.example.mvvmkotlin.model.User
import java.util.*


class UserViewModel(val user: User) : Observer, BaseObservable(){

    init {
        user.addObserver(this)
    }

//    private val successMessage = "Login was successful"
//    private val errorMessage = "Email or Password not valid"
//
//    @Bindable
//    private var toastMessage: String? = null
//
//    @Bindable
//    private var email: String = ""

//    fun getToastMessage(): String? {
//        return toastMessage
//    }
//
//    private fun setToastMessage(toastMessage: String, userEmail: String) {
//
//        this.toastMessage = toastMessage
//        this.email = userEmail
//       notifyPropertyChanged(BR.email)
//    }





    val userName: String
        @Bindable get()
        {
            return user.name
        }

    val userEmail:String
        @Bindable get()
        {
            return user.email
        }


    val password:String
        @Bindable get()
        {
            return user.password
        }

    val  number:String
        @Bindable get()
        {
            return user.number
        }

    override fun update(o: Observable?, arg: Any?) {

        if(arg==String)
        {
            if(arg=="email")
            {
                notifyPropertyChanged(BR.userEmail)
            }
            else if(arg=="name")
            {
                notifyPropertyChanged(BR.userName)
            }
            else if(arg=="password")
            {
                notifyPropertyChanged(BR.password)
            }
            else if(arg=="contact")
            {
                notifyPropertyChanged(BR.number)
            }
        }
    }


    fun onRegister(view: View)
    {

//        this.email = userEmail
    //    Log.d("userViewModel","email: "+"$email")
        Log.d("userViewModel","name: "+userName)
        Log.d("userViewModel","number: "+number)
        Log.d("userViewModel","pass: "+password)
        Log.d("userViewModel","values")

       // setToastMessage(successMessage, email);


    }

    fun isInputDataValid(): Boolean {
        return !TextUtils.isEmpty(userEmail) && Patterns.EMAIL_ADDRESS.matcher(userEmail).matches() && password.length > 3;
    }



}
