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
art();
menu();
    }
public static void art(){
Console c = new Console();
int col = c.getMaxColumns();//This code allows me to know how many columns are in the console
c.setCursor(6,col/3);
c.setTextColor(Color.RED);//This changes the colour to red
c.println("  ++");  
c.setCursor(7,col/3);
c.setTextColor(Color.ORANGE);//This changes the colour to orange
c.println("  ++");          
c.setCursor(8,col/3);
c.setTextColor(Color.YELLOW);//This changes the colour to yellow
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
c.setTextColor(Color.BLACK);//I am changing the colour back to black for the text, so the user can read the text more easily.
String enter;//I am creating a string that allows the user to type something to clear the screen
c.println("If you would like to clear the screen please enter a letter");
enter = c.readLine();//This allows the user to type something
c.clear();//This clears the screens
}
public static void menu(){
Console c = new Console();
int menu;//I am creating a variable for the user to enter the number the mathces their option
c.println("Now there will be a menu with 6 options. Type the number next to the option to select it");
c.println("1) Linear Equations");
c.println("2) Boolean Logic");
c.println("3) Number Fun");
c.println("4) Word Math");
c.println("5) Quadratic Equations");
c.println("6) Statistics");
menu = c.readInt();//This reads which option the user chooses.
//Next I will be creating if statements that tells the program to change the screen depending on which number the user enters
if(menu == 1){
   c.clear();
   c.println("Great you have chosen Linear Equations!");
   double x1;//I am creating a variable to store the point x1
   double y1;//I am creating a variable to store the point y1
   double x2;//I am creating a variable to store the point x2
   double y2;//I am creating a variable to store the point y2
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
    c.println("Sorry this is still under construction");
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







