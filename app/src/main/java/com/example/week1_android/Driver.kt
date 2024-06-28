package com.example.week1_android

import com.example.week1_android.kotlinpractice.Contractor
import com.example.week1_android.kotlinpractice.Employee
import com.example.week1_android.kotlinpractice.FullTime
import com.example.week1_android.kotlinpractice.Intern

object Driver {

    @JvmStatic
    fun main(args: Array<String>) {

        // Homework
        val square: Shape = Square(4.0)
        val rectangle: Shape = Rectangle(4.0, 5.0)
        val triangle: Shape = Triangle(9.0, 2.0)

        println(square)
        println(rectangle)
        println(triangle)

        //my home work
        val sq:Aakar = Chuuko(5.0) //from this we can understand polymorphism(aaro banao opor taar motoh then e bhujteh parbe)
        println(sq)

        // challenge -> figure out a way to print salaries of each employee based on
        //  1. Contractor
        // 2. Full Time
        // 3. Intern
        val employee1: Employee = Contractor("John", "Contractor", 123)
        val employee2: Employee = Intern("Smith", "Full Time", 456)
        val employee3: Employee = FullTime("Sara", "Intern", 789)

        // print employee1
        println(employee1)
        println(employee2)
        println(employee3)
    }
}