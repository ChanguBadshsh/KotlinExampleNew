package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.util.Log

/**
 * Created by tasol on 28/6/17.
 */
class HigherOrderFunctionsLamda : Activity() {
    var sumLamda:(Int,Int)->Int = {x,y -> x+y}

    var dou=doubleTheResult(5,6,sumLamda)

    var printSum=sumLamda(3,4)

    val numbers:Array<Int> = arrayOf(1,2,2);
    val seQuenceNumbers=numbers.map { x->x*x }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.v("@@@WWE"," Summation "+printSum)
//        Log.v("@@@WWE"," Summation "+dou)
        for(nums:Int in numbers){
            Log.v("@@@WWE"," "+nums)
        }
        for(nums:Int in seQuenceNumbers){
            Log.v("@@@WWE"," "+nums)
        }
    }

    fun doubleTheResult(x:Int,y:Int,f:(Int,Int)->Int):Int{
        return f(x,y)*2
    }
}