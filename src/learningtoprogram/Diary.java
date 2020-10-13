/*
 * Author: Frederick Yu
 * Class: ICS3U
 *
 * Program: Diary
 * Input: Diary entrey of my first time coding in Java
 * Output: Outputing the date, person's name, title for the diary entry, and the entry itself.

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
public class Diary{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();			
        c.println("Please enter you full name"); 
        String name;//I am creating a variable to store the name of the user
        name = c.readLine();//This allows the code to see what the user puts in
        c.println("Please enter the title of your diary");
        String title;//This variable is used to store the title of the diary
        title = c.readLine();//This is how the comptuer knows what titel to output.
        c.println("October " + 8 + " " + 2020); //I am printing out the date, but I can't do printDate() because the date has to be the same as the day I wrote the diary
        c.println(name);//This outputs what the user put in as their name
        c.println(title);
        c.println("My First Time Programming in Java!");//I am giving my diary a title
        c.println("For my first time programming I found some thing pretty challenging, but in the end after som bumps I think I understand some of the material now");//I am writing my diary
    }
    

}
