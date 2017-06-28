package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log

/**
 * Created by tasol on 28/6/17.
 */
class KotlinUtilities  {

    companion object {
        fun a() :Int=1
        fun printName(name:String) :String = " Name : "+name
        fun isTeenAger(age:Int):Boolean{
            return age<=18
        }
        fun isTeenAger1(age:Int):Boolean =  age<=18

    }
}