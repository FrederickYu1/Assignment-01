/*
 * Author: Frederick Yu
 * Class: ICS3U
 *
 * Program: SuperCalculator
 * Input: I wil be inputting a mixture of symbols to create some sort of art.
 * Output: Some sort of art will be outputted.

/**
 *
 * @author Frederick Yu
 */
package learningtoprogram;

import hsa.*;
import boardGame.*;
import becker.robots.*;
import java.awt.Color;
import static learningtoprogram.SuperCalculator.roundToDecimals;

/**
 *
 * @author Frederick Yu
 */
public class SuperCalculator{
public static double roundToDecimals(double d, int c) {
int temp=(int)((d*Math.pow(10,c)));
return (((double)temp)/Math.pow(10,c));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
        art(c);
        menu(c);
    }
public static void art(Console c){
    //This code allows me to know how many columns are in the console
    int col = c.getMaxColumns();
    c.setCursor(6,col/3);
    //This changes the colour to red
    c.setTextColor(Color.RED);
    c.println("  ++");  
    c.setCursor(7,col/3);
    //This changes the colour to orange
    c.setTextColor(Color.ORANGE);
    c.println("  ++");          
    c.setCursor(8,col/3);
    //This changes the colour to yellow
    c.setTextColor(Color.YELLOW);
    c.println("  ++    ++++  ++     +  ++++"); 
    c.setCursor(9,col/3);
    c.setTextColor(Color.GREEN);
    c.println("  ++   +   ++  ++   +  +   ++");
    c.setCursor(10,col/3);
    c.setTextColor(Color.CYAN);
    c.println("  ++       ++  ++   +      ++"); 
    c.setCursor(11,col/3);
    c.setTextColor(Color.BLUE);
    c.println("  ++    +++++   ++ +    +++++"); 
    c.setCursor(12,col/3);
    c.setTextColor(Color.MAGENTA);
    c.println("  ++   ++  ++   ++ +   ++  ++");
    c.setCursor(13,col/3);
    c.setTextColor(Color.RED);
    c.println("  ++   ++  ++    ++    ++  ++");
    c.setCursor(14,col/3);
    c.setTextColor(Color.ORANGE);
    c.println("  ++    ++++++   ++     ++++++");
    c.setCursor(15,col/3);
    c.setTextColor(Color.YELLOW);
    c.println("  ++                           ");
    c.setCursor(16,col/3);
    c.setTextColor(Color.GREEN);
    c.println("+++                          ");
    //I am changing the colour back to black for the text, so the user can read the text more easily.
    c.setTextColor(Color.BLACK);
    //I am creating a string that allows the user to type something to clear the screen
    String enter;
    c.println("If you would like to clear the screen please enter a letter");
    //This allows the user to type something
    enter = c.readLine();
    //This clears the screens
    c.clear();
}
public static void menu(Console c){
    //I am creating a variable for the user to enter the number the mathces their option
    int menu;
    c.println("Now there will be a menu with 6 options. Type the number next to the option to select it");
    c.println("1) Linear Equations");
    c.println("2) Boolean Logic");
    c.println("3) Number Fun");
    c.println("4) Word Math");
    c.println("5) Quadratic Equations");
    c.println("6) Statistics");
    //This reads which option the user chooses.
    menu = c.readInt();
    //Next I will be creating if statements that tells the program to change the screen depending on which number the user enters
    if(menu == 1){
       c.clear();
       c.println("Great you have chosen Linear Equations!");
       //I am creating a variable to store the point x1
       double x1;
       //I am creating a variable to store the point y1
       double y1;
       //I am creating a variable to store the point x2
       double x2;
       //I am creating a variable to store the point y2
       double y2;
       //Asking and sotring the variables for the following problems
       c.println("What number will x1 be?");
       x1 = c.readDouble();
       c.println("What number will y1 be?");
       y1 = c.readDouble();
       c.println("What number will x2 be?");
       x2 = c.readDouble();
       c.println("What number will y2 be?");
       y2 = c.readDouble();
       //Telling the user what they have entered
       c.println("Equations for points (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
       //Creating a variable to store the distance
       //I first look at the equation and then I just put in my vairables. 
       double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
       //Then I round the answer to 2 decimal places.
       distance = roundToDecimals(distance,2);
       //I print out the answer that has been rounded
       c.println("Distance between Points: " + distance);
       //Now I am going to find the slope with the point that have provided.
       double slope;
       slope = (y1 - y2) / (x1 - x2);
       //I am rounding the answer and then printing it out for the user
       slope = roundToDecimals(slope,2);
       c.println("Slope of Line: The slope of the given line is " + slope);
       //Now I am going to find the equation of the line with the points given. I first tell the user what the equation will be.
       c.println("The equation of a line is y = mx+b");
       double b = y1 - slope * x1;
       //I am rounding b for when I output it.
       b = roundToDecimals(b,2);
       double equationOfLine = y1 = (slope * x1) + b;
       equationOfLine = roundToDecimals(equationOfLine,2);
       //Here I am only outputting the slope and b as I am only giving the equation
       c.println("Equation of Line: The equation of the line with the given points is y = " + slope + "x + " + b);
       //Next I will be finding the midpoint. I created two variables, one that stores x and the other that stores y
       double midpointX = (x1 + x2) / 2;
       double midpointY = (y1 + y2) / 2;
       //Now I have to round both and out put it
       midpointX = roundToDecimals(midpointX,2);
       midpointY = roundToDecimals(midpointY,2);
       c.println("Midpoint: The midpoint of the line segment is: (" + midpointX + "," + midpointY + ")");
        }
    else if(menu == 2){
        c.clear();
        c.println("Great you have chosen Boolean Logic!");
        c.println("Sorry this is still under construction");
        }
    else if(menu == 3){
        c.clear();
        c.println("Great you have chosen Number Fun!");
        //I first start of with doing factors.
        //I create two variables to store the two numberst the user is going to input
        int a;
        int b;
        //Next I ask for them to enter a number and I store that number inside a variable. Then I repeat that
        c.println("Enter a number:");
        a = c.readInt();
        c.println("Enter another number:");
        b = c.readInt();
        //I create an if statement saying that if the if their first number divided by their second number has a 0 remainder, then the two numbers are divisble. 
        if(a % b == 0){
           c.println(a + " is dvisible by " + b);
        }
        //If the if statement wasn't true, then it can only be not divisble
        else{
            c.println(a + " is not divisble by " + b);
        }
        //Next I move on to odd or even
        //I start by creating a variable to store the number that they input
        int number;
        c.println("Please enter a number:");
        number = c.readInt();
        //My if statement says that if their number dvided by 2 has a remainder of 0, then the number is even.
        if(number % 2 == 0){
            c.println("The number " + number + " is  even");
        }
        //If the statement above wasn't true, then the number has to be odd 
        else{
            c.println("The number " + number + " is odd");
        }
        //Next I do the postive/negative question
        //I start by creating a integer to store the number that they are going to input
        int positiveOrNegative;
        c.println("Please enter an integer:");
        positiveOrNegative = c.readInt();
        //This if statement just says that if their number is bigger than 0, then the number is positive
        if(positiveOrNegative > 0){
            c.println("The integer " + positiveOrNegative + " is positive");
        }
        else{
            c.println("The integer " + positiveOrNegative + " is negative");
        }
        //Lastly, I do highest number
        //I create 5 variable to store the 5 variables I am going to ask the user to input 
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        c.println("Enter the first number: ");
        num1 = c.readInt();
        c.println("Enter the second number: ");
        num2 = c.readInt();
        c.println("Enter the third numer: ");
        num3 = c.readInt();
        c.println("Enter the fourth number: ");
        num4 = c.readInt();
        c.println("Enter the fifth number: ");
        num5 = c.readInt();
        //My if and else if statements takes one of the numbers they input, for example the first number, and then it sees if it's bigger than the other numbers that were inputed. If the number is bigger or equal to everything else, it will output that number.
        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            c.println("The highest number was " + num1);
        }
        else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            c.println("The highest number was " + num2);
        }
        else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            c.println("The highest number is " + num3);
        }
        else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            c.println("The highest number is " + num4);
        }
        else{
            c.println("The highest number is " + num5);
        }
    }
    else if(menu == 4){
        c.clear();
        c.println("Great you have chosen Word Math!");
        c.println("Sorry this is still under construction");
        }
    else if(menu == 5){
        c.clear();
        c.println("Great you have chosen Quadratic Equations!");
        c.println("Sorry this is still under construction");
        }   
    else if(menu == 6){
        c.clear();
        c.println("Great you have chosen Satistics!");
        c.println("Sorry this is still under construction");
        }
}
}







