package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.util.Log

/**
 * Created by tasol on 28/6/17.
 */
class KotlinCollectionsLoops :Activity() {
    val colorNames= arrayOf("Red","Oranges","Green")
    val sortedSelectredColors=colorNames
            .filter { name->name.startsWith("G") }
    val sortedColor=colorNames
            .sortedBy { name->name.length }
    val nums = arrayOf(3,1,2)
    val colorList=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//        for (i in 0..colorNames.size-1 ){
//            Log.v("@@@WWe"," "+colorNames[i])
//        }

        //Array For Each Loop
        for(inp:String in sortedSelectredColors){
            Log.v("@@@"," "+inp)
        }
        for(inp:String in sortedColor) {
            Log.v("@@@", " " + inp)
        }

//        Log.v("@@@WWe"," Numbers")
        var sum=0
        // var used for variable val used for Constant
        for(num:Int in nums){
            sum=sum+num
//            Log.v("@@@WWe"," "+sum)
        }

//        Log.v("@@@WWe"," Numbers Operation")
        nums.sortBy { it }
        for(num:Int in nums){
//            Log.v("@@@WWe"," "+num)
        }
    }


}