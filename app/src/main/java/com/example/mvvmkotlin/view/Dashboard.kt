package com.example.mvvmkotlin.view

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmkotlin.Adapter.ContactAdapter

import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.model.User
import com.example.mvvmkotlin.model.contact_model
import android.widget.Toast
import android.content.pm.PackageManager
import android.os.AsyncTask.execute
import android.Manifest.permission
import android.Manifest.permission.READ_CONTACTS
import android.os.Build
import android.database.Cursor
import com.example.mvvmkotlin.databinding.ActivityRegisterBinding


class Dashboard : AppCompatActivity() {

     val PERMISSIONS_REQUEST_READ_CONTACTS: Int = 100
     var recyclerView : ListView ?= null
     var contactAdapter : ContactAdapter ?= null
     var contactModelArrayList: ArrayList<contact_model>? = null
    var phones: Cursor? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)



        showContacts()
    }

    private fun showContacts() {
        // Check the SDK version and whether the permission is already granted or not.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(arrayOf(Manifest.permission.READ_CONTACTS), PERMISSIONS_REQUEST_READ_CONTACTS)
            //After this point you wait for callback in onRequestPermissionsResult(int, String[], int[]) overriden method
        } else {
            // Android version is lesser than 6.0 or the permission is already granted.
            phones = applicationContext.contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC"
            )
            readContacts()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {

        if (requestCode == PERMISSIONS_REQUEST_READ_CONTACTS) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission is granted
                showContacts()
            } else {
                Toast.makeText(this, "Until you grant the permission, we canot display the names", Toast.LENGTH_SHORT).show()
            }
        }
    }





    private fun readContacts()
    {
        recyclerView = findViewById(R.id.listView) as ListView
        contactModelArrayList = ArrayList()

        val phones = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC")
        while (phones!!.moveToNext()) {
            val name = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
            val phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))

            val contactModel = contact_model()
            contactModel.setNames(name)
            contactModel.setNumbers(phoneNumber)
            contactModelArrayList!!.add(contactModel)
            Log.d("name>>", name + "  " + phoneNumber)
        }
        phones.close()

        contactAdapter = ContactAdapter(this, contactModelArrayList!!)
        recyclerView!!.adapter = contactAdapter
    }

}
