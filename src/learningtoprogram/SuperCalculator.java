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
Console c = new Console();int col = c.getMaxColumns();
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
