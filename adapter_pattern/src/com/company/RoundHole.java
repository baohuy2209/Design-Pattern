package com.company;

import com.company.RoundPeg ;

public class RoundHole {
    private double radius;

    public RoundHole(double radius){
        this.radius = radius ;
    }

    public double getRadius(){
        return radius ;
    }

    public boolean fits(RoundPeg roundpeg){

        boolean result = this.getRadius() >= roundpeg.getRadius();

        return result ;
    }
}
