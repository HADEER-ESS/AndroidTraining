package com.example.newtestapp

class OuterClass{
    private val name :String = "Sally"

    class NestedClass{
        var description :String = "Code Call From Nested Class"
        private val id : Int = 13

        fun printOut(){
            print("In Nested Class Creating Object = ")
            //println("User Name IS $name") //Nested class can't access the properties of outer class
            print("User ID is $id") //Nested Class can only access its properties
        }
    }

    inner class InnerClass{
        var desc:String = "Code Call From Inner Class"
        private val id : Int = 17

        fun printOutput(){
            print("\n In Inner Class Creating Object = ")
            print("User Name Is $name") //Inner class can access the outer class properties even it is a private
            print(" & User ID is $id")
        }
    }
}

//Access Nested and Inner Class

fun main(){
    println("NestedClass = ${OuterClass.NestedClass().description}")
    println("InnerClass = ${OuterClass().InnerClass().desc}")

    //Create Object
    val obj1 = OuterClass.NestedClass()
    obj1.printOut()

    val obj2 = OuterClass().InnerClass()
    obj2.printOutput()
}