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
        c.println("The name of this restaurant is McDonald");
        c.println("Hello! Welcome to McDonalds, the biggest fast food burger chain!");
        c.println("** Hi, my nmae is Frederick and I will be your server tonight! **");
        c.println("Served on");
        c.printDate();
        c.println(" ");
        c.printTime();
    }

}
