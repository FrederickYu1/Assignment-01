/*
 * Author: Frederick Yu
 * Class: ICS3U
 *
 * Program: Restaurant Helper
 * Input: Inputting invaluable business tools int he restaurant world
 * Output: Introduction for myself, bills from menu items, texes, tips, etx.

/**
 *
 * @author Frederick Yu
 */
package learningtoprogram;

import hsa.*;
import boardGame.*;
import becker.robots.*;

/**
 *
 * @author Frederick Yu
 */
public class RestaurantHelper{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();			
        c.println("The name of this restaurant is McDonald");//This is the name of the restaurant 
        c.println("Hello! Welcome to McDonalds, the biggest fast food burger chain!");//I am introducing the restaurant 
        c.println("** Hi, my nmae is Frederick and I will be your server tonight! **");//I am introducing myself
        c.println("Served on");
        c.printDate();//I am telling them the date
        c.println(" ");//I want to seperate the date and time, so it's not in a cluster
        c.printTime();//I am printing the time 
    }

}
