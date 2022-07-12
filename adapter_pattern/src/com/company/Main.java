package com.company;

import com.company.SquarePeg ;
import com.company.SquarePegAdapter ;
import com.company.RoundPeg ;
import com.company.RoundHole ;


public class Main {

    public static void main(String[] args) {
	// write your code here

        RoundHole rhole = new RoundHole(5) ;
        RoundPeg rpeg = new RoundPeg(5) ;

        if(rhole.fits(rpeg)){
            System.out.println("Round peg r5 fits round hole r5 . ");
        }

        SquarePeg speg1 = new SquarePeg(5) ;
        SquarePeg speg2 = new SquarePeg(20) ;

        SquarePegAdapter smallspeg = new SquarePegAdapter(speg1) ;
        SquarePegAdapter largestspeg = new SquarePegAdapter(speg2) ;

        if(rhole.fits(largestspeg)){
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(rhole.fits(smallspeg)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
