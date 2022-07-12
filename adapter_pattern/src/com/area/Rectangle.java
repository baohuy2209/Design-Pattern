package com.area;

public class Rectangle {
    private double width;
    private double height ;

    public Rectangle(double width, double height){
        this.width = width ;
        this.height = height ;
    }

    public double getWidth(){
        return this.width ;
    }
    public void setWidth(double width){
        this.width = width ;
    }

    public double getHeight(){
        return this.height ;
    }
    public void setHeight(double height){
        this.height = height ;
    }

    public double getArea(){
        double result = this.width*this.height ;

        return result ;
    }

    public double getParameter(){
        double result = (this.width + this.height)*2 ;

        return result ;
    }
}
