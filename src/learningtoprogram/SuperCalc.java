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
           double x1;//I am creating a variable to store the point x1
           double y1;//I am creating a variable to store the point y1
           double x2;//I am creating a variable to store the point x2
           double y2;//I am creating a variable to store the point y2
           c.println("What number will x1 be?");
           x1 = c.readDouble();
           c.println("What number will y1 be?");
           y1 = c.readDouble();
           c.println("What number will x2 be?");
           x2 = c.readDouble();
           c.println("What number will y2 be?");
           y2 = c.readDouble();
           c.println("Equations for points (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
           double problem1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
           c.println("Distance between Points: " + problem1);
           double problem2;
           problem2 = (y1 - y2) / (x1 - x2);
           c.println("Slope of Line: The slope of the given line is " + problem2);
           c.println("The equation to of a line is y=mx+b");
           double b = y1 - problem2 * x1;
           double problem3 = y1 = (problem2 * x1) + b;
           c.println("Equation of Line: The equation of the line with the given points is y = " + problem2 + "x + " + b);
           double xOfProblem4 = (x1 + x2) / 2;
           double yOfProblem4 = (y1 + y2) / 2;
           c.println("Midpoint: The midpoint of the line segment is: " + xOfProblem4 + "," + yOfProblem4);
    }

}

