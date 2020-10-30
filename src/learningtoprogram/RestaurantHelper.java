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
import static learningtoprogram.RestaurantHelper.roundToDecimals;

/**
 *
 * @author Frederick Yu
 */
public class RestaurantHelper{
public static double roundToDecimals(double d, int c) {
int temp=(int)((d*Math.pow(10,c)));
return (((double)temp)/Math.pow(10,c));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();			
        //I first create an Introdcution
        c.println("The name of this restaurant is McDonald");
        c.println("Hello! Welcome to McDonalds, the biggest fast food burger chain!");
        c.println("*** Hi, my name is Frederick and I will be your server tonight! ***");
        c.print("Today's date and time is ");
        c.printDate();
        c.print(" at ");
        c.printTime();
        c.println(" ");
        //I am setting up a variable that I can use later to store the bill
        double billTotal;
        //This is providing the user the qeustion to how much they will be paying
        c.println(" ");
        c.println("I hope you had a great evening what would your bill total be today?");
        //This let's the program read what the user says.
        billTotal = c.readDouble();
        //Next I will be calculating the tax and adding it to billTotal and I first create a variable to store the tax
        double taxes;
        //The first if statement is determining if the billTotal was bigger than 4
        if(billTotal > 4.0){
            //If it is bigger than 4, I will multiply the billTotal by 0.13 and store that in taxes
            taxes = billTotal * 0.13;
        }
        else{
            //If the statement above was false than I will multiply the total by 0.05 and store it in taxes
            taxes = billTotal * 0.05;
        }
        //I am creating a variable for how much tip they want to give.
        double tip;
        //I am asking how much tip they are willing to pay
        c.println("How much would you like to tip");
        //This let's the program to read how much tip they are paying
        tip = c.readDouble();
        //This variable calculates the total cost of everything combined by add the billTotal and the tip.
        double finalCost = tip + billTotal + taxes;
        //Next I will be rounding all of the final numbers
        billTotal = roundToDecimals(billTotal,2);
        taxes = roundToDecimals(taxes,2);
        tip = roundToDecimals(tip,2);
        finalCost = roundToDecimals(finalCost,2);
        //Here I am tellilng the user how my much they need to pay.
        c.println("------------------------------------------------");
        c.println("-----------------Your Bill----------------------");
        c.println("------------------------------------------------");
        c.println("Total Cost of Meal: $"  + billTotal);
        c.println("Taxes:              $" + taxes);
        c.println("Tip:                $" + tip);
        c.println("Total:              $" + finalCost);
        c.println("------------------------------------------------");
        //Lastly I need to create and if statement to check if they paid enough money. 
        double amountPaid;
        c.println("Enter the amount paid: ");
        amountPaid = c.readDouble();
        //This if statements looks at if they paid the correct amount, if they paid less I will call the police, if they paid mroe I will thahk them. 
        if(amountPaid < finalCost){
            c.println("That is not enough money. I will have to call the police.");
        }
        else if (amountPaid > finalCost){
            c.println("Thank you so much for the extra donation!");
        }
        else{
            c.println("Thank you so much. Have a great day!");
        }
    }

}
