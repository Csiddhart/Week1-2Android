package com.example.week1_android;


// Create a class called Shape and calculate area using inheritance and polymorphism concepts we learned
// to calculate the area of Square, Rectangle and Triangle
public class Homework {
}

class Shape {
    double side; // square
    double length; // rectangle
    double breadth; // rectangle

    Shape(double side) {
//        System.out.println("constructor of Shape(side)");
        this.side = side;
    } // square needs one feature to calculate ares

    Shape(double length, double breadth) { //2 features :-  length and breadth
        //System.out.println("constructor of Shape(l,b)");

        this.length = length;
        this.breadth = breadth;
    }

    public String toString() {
       // System.out.println("toString of Shape");
        return "Area of ";
    }
}

class Square extends Shape {
    Square(double side) { // 1 parameter one field to calculate
        super(side);
    }

    public double calculateArea() {
        System.out.println("calculating Area of Square(side)");
        return (super.side * super.side);
    }

    public String toString() {
        return super.toString() + "Square : " + calculateArea();
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double breadth) { // lenght and breadth
        super(length, breadth);
    }

    public double calculatedArea() {
        System.out.println("calculating Area of Rectangle(l,b)");
        double areaOfRectangle = super.length * super.breadth;
        return areaOfRectangle;
    }

    public String toString() {
        return super.toString() + "Rectangle : " + calculatedArea();
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    public double calculatedArea() {
        System.out.println("calculating Area of Triangle(l,b)");
        double areaOfTriangle = 0.5 * super.length * super.breadth;
        return areaOfTriangle;
    }

    public String toString() {
        return super.toString() + "Triangle : " + calculatedArea();
    }
}
