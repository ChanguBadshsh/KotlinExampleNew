package com.kotlinexamplenew

import android.app.Activity
import android.os.Bundle
import android.util.Log

/**
 * Created by tasol on 28/6/17.
 */
class KotlinFunctions :Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        simplePrint("Pratik")
//        Log.v("@@@WWE"," Func with return val "+simpleFunctionWithReturnValue("Pratik Vyas"))
//        if(isEligibleMember(23)){
//            Log.v("@@@WWE"," Person is eligible for Driving age :"+23)
//        }else{
//            Log.v("@@@WWE"," Person is Not eligible for Driving age : "+23)
//        }
//        if(isEligibleMember(14)){
//            Log.v("@@@WWE"," Person is eligible for Driving age :"+14)
//        }else{
//            Log.v("@@@WWE"," Person is Not eligible for Driving age : "+14)
//        }
        var pratik=Person("Pratik Vyas",23,"pratik@gmail.com")
        var rohan=Person("Rohan ",14,"pratik@gmail.com")



        if(pratik.isTeenAger()){
            Log.v("@@@WWe"," "+pratik.name+" is Teen Ager")
        }
        if(rohan.isTeenAger()){
            Log.v("@@@WWe"," "+rohan.name+" is Teen Ager")
        }
    }

    fun simplePrint(name :String){
        //Simple Function
        Log.v("@@@WWe","Simple Functions")
        Log.v("@@@WWe"," Name : "+name)
    }
    fun simpleFunctionWithReturnValue(name: String):String{
        return name
    }
    fun isEligibleMember(age:Int):Boolean{
        return age>=18
    }
    fun Person.isTeenAger():Boolean{
        return age in 0..17
    }
}