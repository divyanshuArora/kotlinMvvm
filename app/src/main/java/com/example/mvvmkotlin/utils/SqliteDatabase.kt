package com.example.mvvmkotlin.utils

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.mvvmkotlin.model.User

class SqliteDatabase(context: Context) : SQLiteOpenHelper(context,dbName,null,1)
{

 var sqLiteDatabase: SqliteDatabase ?= null
    var helper: SQLiteDatabase? = null


    override fun onCreate(sqliteDatabase: SQLiteDatabase?)
    {
        val CREATE_USER_TABLE =
            ("create table IF NOT EXISTS " + USER_TABLE + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                    + NAME + " TEXT,"
                    + EMAIL + " TEXT,"
                    + PASSWORD + " TEXT"
                    + ")")
        Log.d("Sqlite","createTable"+CREATE_USER_TABLE)
        sqliteDatabase?.execSQL(CREATE_USER_TABLE)

    }


    fun addUser(user: User) {

        val sqLiteDatabase = this.writableDatabase

        val contentValues = ContentValues()

        contentValues.put(NAME, user.name)
        contentValues.put(EMAIL, user.email)
        contentValues.put(PASSWORD, user.password)

        sqLiteDatabase.insert(USER_TABLE, null, contentValues)
        sqLiteDatabase.close()
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    companion object {

        private val dbName = "KotlinMVVM"
        private val USER_TABLE = "users"
        private val ID = "id"
        private val NAME = "user_name"
        private val EMAIL = "user_email"
        private val PASSWORD = "user_password"
    }


}
