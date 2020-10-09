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
        c.println("October " + 8 + " " + 2020); //I am printing out the date, but I can't do printDate() because the date has to be the same as the day I wrote the diary
        c.println("Frederick Yu");//I am printing my name
        c.println("My First Time Programming in Java!");//I am giving my diary a title
        c.println("For my first time programming I found some thing pretty challenging, but in the end after som bumps I think I understand some of it now");//I am writing my diary
    }

}
