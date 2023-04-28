package com.example.newtestapp

//DAY1
//fun main(){
////    var res = addUp(3,4)
//////    println("The result is $res")
////    var nullableName : String? = "Sally"
////    nullableName = null
//
////    val name = nullableName ?: "Ahmed"
////
////    println("The name is $name")
//
////    println("The name in lower case is " + nullableName!!.lowercase())
//}

//fun addUp(a:Int , b :Int) : Int{
//    return a + b
//}

//DAY2
//fun main(){
//    var mob = MobilePhone("Android" , "Samsung" , "Galaxy S20 Ultra")
//    var mob2 = MobilePhone(osName = "IOS" , model = "5S small")
//    var mob3 = MobilePhone(brand = "Apple", osName = "IOS" , model = "5S small")
//}
//class MobilePhone(osName:String , brand:String = "Samsung" , model : String){
//
//    init{
//        println("$brand $model. Here the osName is $osName, brand is $brand, model is $model.")
//    }
//}

//DAY3
fun main(){
    var denis = Person("Denis" , "Doe" , 25)
    //overwrite the primary age value
    denis.age = 31
    denis.userAge()
    denis.hobby = "Watch Football"
    denis.userHobby()

    var myCar = Car()
    println("My Car Brand Is ${myCar.myBrand}")

    //Try To Access The Private MyModal Setter
    //myCar.myModal = "M3"  //can not assign the myModal variable because it is Private

    //The Get Method For myModal Variable is Accessible outside the calss so It won't print error
    println("My Car Modal Is ${myCar.myModal}")

    myCar.maxSpeed = 400
    println("My Car max speed is ${myCar.maxSpeed}")

    myCar.maxSpeed = 0
    println("My Car max speed is ${myCar.maxSpeed}")

}
              //PRIMARY CONSTRUCTOR
class Person(Fname:String = "John" , Lname:String="Deo"){

    //MEMBER VARIABLE -PROPERTY
    var age:Int? = null;
    var hobby:String? = null;
    var fname:String? = null

    //INITIALIZE BLOCK
    init {
        println("Hello My name is $Fname $Lname .")
        this.fname = Fname
    }

    //MEMBER FUNCTION -METHOD
    fun userHobby(){
        println("$fname /'s Hobby Is $hobby")
    }
    fun userAge(){
        //To use Fname and Lname primary constructor in the function I have to define them as age,
        //I can only use them inside the initialized block
        println("$fname has $age years old")
    }

     //MEMBER SECONDARY CONSTRUCTOR
     constructor(Fname: String, Lname: String, age:Int): this(Fname, Lname) {
         this.age = age
     }
}

class Car(){
    //If The Is A Variable I Don't Define(initialize) It With A Value, Can Use lateinit
    lateinit var owner : String

    var myBrand :String = "BMW"
        get(){
            //field refer to the variable
            return field.lowercase()
        }
    var myModal:String = "M5"
        private set

    init {
        this.owner = "John"
        //As A setter Method Is private, so It can be Access only In Class Itself
        this.myModal = "M3"
    }

    var maxSpeed : Int = 2400
        set(value) {
            //create a condition to change the variable value
            field = if (value > 0) value else throw IllegalAccessException("The Max Speed Must Be More Then Zero")
        }
}