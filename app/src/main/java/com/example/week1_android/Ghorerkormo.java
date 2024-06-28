package com.example.week1_android;

// Create a class called Shape(ekhane aakar) and calculate area using inheritance and polymorphism concepts we have learned
// Now calculate the area of Square, Rectangle and Triangle


public class Ghorerkormo {
}

class Aakar{
    //variables declared
    double sides;
    double length;
    double breadth;

 //now constructor(parameterised)
    Aakar(double sides){
        this.sides=sides;
    }//square er kaaj holo

    Aakar(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }//ekhane rectangle aar triangle er kaaj sesh

    public String toString(){
        return "Area of";
    }
}

//now the inheritance concept
class Chuuko extends  Aakar{
    Chuuko(double sides){//one parameter used for calculating area of square
        super(sides);
    }

    public double calArea(){
        System.out.println("calculating area of square");
        return(super.sides*super.sides);
    }
    public String toString(){
        return super.toString() + " Square " + calArea();
    }
}
