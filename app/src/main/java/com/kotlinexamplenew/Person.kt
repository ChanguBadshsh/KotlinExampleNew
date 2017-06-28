package com.kotlinexamplenew

/**
 * Created by tasol on 28/6/17.
 */
class Person (var name:String,var age:Int){
    var email :String=""
    constructor(name: String,age: Int,email:String):this(name,age){
        this.email=email
    }

}