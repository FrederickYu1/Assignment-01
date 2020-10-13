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
        c.println(" ");
        double billTotal;//I am setting up a variable that I can use later to store the bill
        c.println("I hope you had a great evening what would your bill total be today?");//This is providing the user the qeustion to how much they will be paying
        billTotal = c.readDouble();//This let's the program read what the user says.
        double tip;//I am creating a variable for how much tip they want to give.
        c.println("How much would you like to tip");//I am asking how much tip they are willing to pay
        tip = c.readDouble();//This let's the program to read how much tip they are paying
        double finalCost = tip + billTotal;//This variable calculates the total cost of everything combined by add the billTotal and the tip.
        c.println("Great. Your total today will be " + "$" + finalCost);//Here I am tellilng the user how my much they need to pay.
    }

}
