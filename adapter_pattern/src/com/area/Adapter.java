package com.area;

import com.area.Targetarea ;
import com.area.Triangle ;
import com.area.Rectangle ;
import java.util.Scanner ;

public class Adapter implements Targetarea{
    private Triangle triangle ;
    private Rectangle rectangle ;

    public Adapter(Triangle triangle, Rectangle rectangle){
        this.triangle = triangle ;
        this.rectangle = rectangle ;
    }

    public void getArea(){
        String type ;
        System.out.println("Enter type of geometric form : ") ;
        Scanner sc = new Scanner(System.in) ;
        type = sc.nextLine() ;
        double result = 0 ;
        if(type.equals("Triangle") || type.equals("triangle")){
            result = this.triangle.getArea() ;
        }else if (type.equals("Rectangle") || type.equals("rectangle")){
            result = this.rectangle.getArea() ;
        }

        System.out.println(result);
    }

    public void getParameter(){
        String type ;
        System.out.println("Enter type of geometric form : ") ;
        Scanner sc = new Scanner(System.in) ;
        type = sc.nextLine() ;
        double result = 0 ;
        if(type.equals("Triangle") || type.equals("triangle")){
            result = this.triangle.getParameter() ;
        }else if (type.equals("Rectangle") || type.equals("rectangle")){
            result = this.rectangle.getParameter() ;
        }

        System.out.println(result);
    }
}
