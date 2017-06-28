package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.util.Log

/**
 * Created by tasol on 28/6/17.
 */
class ConditionalConstruct : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("@@@WWE"," Pratik : "+checkValidity(10))
        Log.v("@@@WWE"," Dharmesh : "+checkValidity(0))
        Log.v("@@@WWE"," Mrugen : "+checkValidity(30))

        Log.v("@@@WWE"," Sachin : "+checkValidityString("Sachin"))
        Log.v("@@@WWE"," Aamir : "+checkValidityString("Aamir"))
        Log.v("@@@WWE"," Kohlii : "+checkValidityString("Kohlii"))

        Log.v("@@@@WE"," Utils "+KotlinUtilities.a())
        Log.v("@@@@WE"," Utils "+KotlinUtilities.printName("Pratik Vyas"))
        if(KotlinUtilities.isTeenAger(23)){
            Log.v("@@@WWe"," Pratik Is TeenAger")
        }else{
            Log.v("@@@WWe"," Pratik Is Not TeenAger")
        }
        if(KotlinUtilities.isTeenAger1(16)){
            Log.v("@@@WWe"," Devish Is TeenAger")
        }else{
            Log.v("@@@WWe"," Devish Is Not TeenAger")
        }
    }
    fun checkValidity(period:Int):String{
        var validity=""
        when(period){
            0->validity= "New "
            in 1..10-> validity="Silver member"
            in 11..20-> validity= "Gold member"
            else -> validity= "Prime Member"
        }
        return validity
    }
    fun checkValidityString(period:String):String{
        var validity=""
        when(period){
            "Sachin"->validity="Master Blaster"
            "Kohli"->validity="New Hope"
            "Aamir"->validity="Fast bowler"
        }
        return validity
    }
}