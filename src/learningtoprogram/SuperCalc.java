/*
 * Author: Frederick Yu
 * Class: ISC4U
 * Pogram: CuperCalc
 */
package learningtoprogram;

import hsa.*;
import boardGame.*;
import becker.robots.*;

/**
 *
 * @author Frederick Yu
 */
public class SuperCalc{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
           double x1;
           double y1;
           double x2;
           double y2;
           c.println("What number will x1 be?");
           x1 = c.readInt();
           c.println("What number will y1 be?");
           y1 = c.readInt();
           c.println("What number will x2 be?");
           x2 = c.readInt();
           c.println("What number will y2 be?");
           y2 = c.readInt();
           double problem1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
           c.println(problem1);
           
    }

}

