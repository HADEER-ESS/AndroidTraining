package com.example.newtestapp

//DATA CLASS

data class User(val id:Long , var name:String , var age:Int)

fun main(){
    val user1 = User(1 , "John" , 25)

    //Destruction
//    var(id ,name,age) = user1
//    println("Your Friend name is $name and he has $age years old") //Your Friend name is John and he has 25 years old
    //Change The Class Parameter The Defined By Var
    user1.name = "Micheal"
    user1.age = 31
    println("user one value is $user1")  //use one value is User(id=1 , name=Micheal , age=31)

    //Can Copy From The Instance
    var updatedUser = user1.copy(id=3 , name="Sally Doe" , age=11)
    println("Updated user = $updatedUser")

    //can also be Destructed
    var(_,name, age) = updatedUser
    println("Your Friend name is $name and he has $age years old") //Your Friend name is John and he has 25 years old

}