package com.area;

import com.area.Targetarea ;
import com.area.Triangle ;
import com.area.Rectangle ;

public class client {
    public static void main(String [] args){
        Triangle triangle = new Triangle(5,6,7) ;
        Rectangle rectangle = new Rectangle(10, 20) ;

        Targetarea targetarea = new Adapter(triangle, rectangle) ;

        targetarea.getArea() ;
        targetarea.getParameter() ;
    }
}
