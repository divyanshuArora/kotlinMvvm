package com.example.mvvmkotlin.model

import androidx.databinding.Bindable
import java.util.*

class User: Observable()
{

        var id: String = ""
            set(value)
            {
                field=value
                setChangedandNotify("user_id")
            }

        var name: String = ""
            set(value)
            {
                field=value
                setChangedandNotify("user_name")
            }

        var email: String = ""
            set(value)
            {
                field=value
                setChangedandNotify("user_email")
            }
        var password: String = ""
            set(value)
            {
                field=value
                setChangedandNotify("user_password")
            }
        var number: String = ""
            set(value)
            {
                field=value
                setChangedandNotify("user_number")
            }

        private fun setChangedandNotify(s: Any) {
            setChanged()
            notifyObservers(s)
        }


    }


