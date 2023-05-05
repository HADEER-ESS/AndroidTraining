package com.example.newtestapp

/*
TASK=>
     Please write a program that adds five Numbers (Double) to an arrayList
     and then calculates the average of those numbers. Please use a for (in) loop in this exercise.
     Good luck :)
 */

fun main(){
     val arrayList : ArrayList<Double> = ArrayList<Double>(5)

     val doubleNumList : List<Double> = listOf(1.5,2.7,3.3,4.9,5.1)
     arrayList.addAll(doubleNumList)

//     arrayList.add(1.5)
//     arrayList.add(2.7)
//     arrayList.add(3.3)
//     arrayList.add(4.9)
//     arrayList.add(5.1)

     println("The Array List is $arrayList")
      val len:Int = arrayList.size
     var total: Double = 0.0
     for(item in arrayList){
          total += item
     }
     println("The Average Of The List Number Is... ${total/len}") //3.5

}