package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

/**
 * Created by tasol on 28/6/17.
 */
class KotLinDatabaseExample : Activity() {
    val helper = KotlinHelper(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.db_dash)
        val btnPop = findViewById(R.id.btnPop) as Button
        val btnGet = findViewById(R.id.btnGet) as Button
        val btnUpdate = findViewById(R.id.btnUpdate) as Button
        val btnDelete = findViewById(R.id.btnDelete) as Button


        val sachin = Users(1, "Sachin Tendulkar", 40)
        val kohli = Users(2, "Kohli", 27)
        val dhoni = Users(3, "Dhoni", 36)
        val sangakara = Users(4, "Sangakara", 36)

        btnPop.setOnClickListener(View.OnClickListener {
            helper.populatePerson(sachin)
            helper.populatePerson(kohli)
            helper.populatePerson(dhoni)
            helper.populatePerson(sangakara)
        })
        btnGet.setOnClickListener(View.OnClickListener {
            printUser(helper.getUsers())
        })
        btnUpdate.setOnClickListener(View.OnClickListener {
            updateUser();
        })
        btnDelete.setOnClickListener(View.OnClickListener {
            deleteUser()
        })
    }

    fun printUser(users: List<Users>) {
        for (user: Users in users) {
            Log.v("@@@WWE", " Users ID : " + user.userID + " Name : " + user.userName + " Age : " + user.userAge)
        }
    }

    fun updateUser() {
        val dhoni = Users(3, "M S Dhoni", 35)
        helper.updateUser(dhoni)
    }

    fun deleteUser() {
        val sangakara = Users(4, "Sangakara", 36)
        helper.deleteUser(sangakara)
    }
}