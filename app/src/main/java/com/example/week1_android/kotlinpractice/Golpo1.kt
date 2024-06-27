package com.example.week1_android.kotlinpractice

// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert
object Story1 {
    // this part makes code very difficult to understand due to if statements
    fun printEmployeeSalary(employee: Employee) {
        if (employee.employeeType == "Contractor") {
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
    }

    fun printHelloWorld() {
        for (i in 1..5) {
            println("Hello World$i") // concatenation
        }
    }

    fun calculate(input1: Int, input2: Int): Int { // returning int transferring to a variable
        return input1 + input2
    }

    fun calculate2(a: Int, b: Int) {
        println(a + b)
    }
}


// blue print of data which represents an employee with employee data
open class Employee(// data
    var employeeName: String, // full time, intern, contractor
    var employeeType: String, var employeeId: Int
) {
    // parameter / argument
    init {
        this.employeeName = employeeName
    }

    // toString() -> method
    override fun toString(): String {
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

internal class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary: String = "$100,000"

    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    } // we are also inheriting toString from parent class and on top of that we are adding Salary string
}

// Intern & Full time
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary: String = "$50,000"

    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

internal class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary: String = "$150,000"

    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}