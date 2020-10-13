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

/**
 *
 * @author Frederick Yu
 */
public class SuperCalculator{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
        c.setCursor(9,40);
        c.setTextColor(Color.RED);//This changes the colour to red
        c.println("   ---   "); //I am trying to create a square here
        c.setCursor(10,40);
        c.setTextColor(Color.ORANGE);//This changes the colour to orange
        c.println("   | |   ");
        c.setCursor(11,40);
        c.setTextColor(Color.YELLOW);//This changes the colour to yellow
        c.println("   ---   ");//This is the end of my square
        c.setCursor(12,40);
        c.setTextColor(Color.GREEN);//This changes the colour to green
        c.println("----------");//This is the beginning of me trying to draw the letter F
        c.setCursor(13,40);
        c.setTextColor(Color.CYAN);//This changes the colour to cyan, which is basically light blue
        c.println("|");
        c.setCursor(14,40);
        c.setTextColor(Color.BLUE);//This changes the colour to blue
        c.println("|");
        c.setCursor(15,40);
        c.setTextColor(Color.MAGENTA);//This changes the colour to magenta
        c.println("|------");
        c.setCursor(16,40);
        c.setTextColor(Color.RED);//This changes the colour to red
        c.println("|");
        c.setCursor(17,40);
        c.setTextColor(Color.ORANGE);//This changes the colour to orange
        c.println("|");
        c.setCursor(18,40);
        c.setTextColor(Color.YELLOW);//This changes the colour to yellow
        c.println("|");
        c.setTextColor(Color.BLACK);//I am changing the colour back to black for the text, so the user can read the text more easily.
        String enter;//I am creating a string that allows the user to type something to clear the screen
        c.println("If you would like to clear the screen please enter a letter");
        enter = c.readLine();//This allows the user to type something
        c.clear();//This clears the screens
        int menu;//I am creating a variable for the user to enter the number the mathces their option
        c.println("Now there will be a menu with 6 options. Type the number next to the option to select it");
        c.println("1) Linear Equations");
        c.println("2) Boolean Logic");
        c.println("3) Number Fun");
        c.println("4) Word Math");
        c.println("5) Quadratic Equations");
        c.println("6) Statistics");
        menu = c.readInt();//This reads which option the user chooses.
    }

}
