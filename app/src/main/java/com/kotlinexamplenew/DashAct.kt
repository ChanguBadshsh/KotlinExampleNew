package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.ArrayList

/**
 * Created by tasol on 27/6/17.
 */
class DashAct : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRes = findViewById(R.id.btnRes) as Button
        val tvRes = findViewById(R.id.tvRes) as TextView


        btnRes.setOnClickListener(View.OnClickListener {
            getValue()
        })
    }

    fun sortLenthLamda() {
        val items = ArrayList<String>()
        items.add("pratik")
        items.add("dharmesh")
        items.add("vyas")
        for (stri: String in items) {

            Log.v("@@@ Before", " Val " + stri)
        }
        items.sortBy { it.length }
        for (stri: String in items) {

            Log.v("@@@ AFter", " Val " + stri)
        }
    }

    fun sortAlphabetLamda() {
        val item = ArrayList<String>()
        item.add("Aman")
        item.add("Baman")
        item.add("Caman")
        item.sortBy { it.capitalize() }
        for (inp: String in item) {
            Log.v("@@@", " " + item)
        }
    }

    val sayHello = {
        user: String ->
        Log.v("@@@Hello ", " " + user)
    }

    val nameAge = {
        name: String, age: Int ->
        Log.v("@@@", " Name " + name + " Age " + age)
    }

    val indianNames = arrayOf("Pratik", "Dharmesh", "Vyas", "Parth", "Sachin")
    val selectedName = indianNames
            .filter { name -> name.startsWith("P", ignoreCase = true) }
            .sortedBy { name -> name.length }


    fun getValue() {
        Log.v("@@@WWe", "Before")
        for (i in 0..indianNames.size - 1) {
            Log.v("@@@WWe", " " + indianNames[i])
        }

        Log.v("@@@WWe", "After")
        for (j in 0..selectedName.size - 1) {
            Log.v("@@@WWe", " " + selectedName[j])
        }
    }
}