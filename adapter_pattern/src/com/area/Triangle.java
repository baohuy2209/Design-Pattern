package com.area;

public class Triangle {

    private double a,b,c ;

    public Triangle(double a, double b, double c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }

    public double getFirst_border(){
        return this.a ;
    }
    public void setFirst_border(double a){
        this.a = a ;
    }

    public double getSecond_border(){
        return this.b ;
    }
    public void setSecond_border(double b){
        this.b = b ;
    }

    public double getThird_border(){
        return this.c ;
    }
    public void setThird_border(double c){
        this.c = c ;
    }

    public double getArea(){
        double area ;
        double p = (this.a+this.b+this.c)/2 ;
        area = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)) ;

        return area ;
    }

    public double getParameter(){
        double parameter = this.a+this.b+this.c ;

        return parameter;
    }
}
