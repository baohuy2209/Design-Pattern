package com.company;

import com.company.RoundPeg ;
import com.company.SquarePeg ;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg ;

    public SquarePegAdapter (SquarePeg squarepeg) {
        super(squarepeg.getWidth()) ;
        this.squarePeg = squarepeg ;
    }

    public double getRadius(){
        double result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));

        return result ;
    }
}
