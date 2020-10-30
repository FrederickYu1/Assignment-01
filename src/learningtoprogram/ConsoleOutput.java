/*
 * Author: Frederick Yu
 * Class: ISC4U
 * Pogram: First Program
 */
package learningtoprogram;

import hsa.*;
import boardGame.*;
import becker.robots.*;

/**
 *
 * @author Frederick Yu
 */
public class ConsoleOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
        c.println(1);					//you can print numbers (notice not quotes)			//
        c.println(25 / 5);				//you can do basic math in the printlns
        c.println("Happy " + 1 + " st Birthday");  //you can combine things with +, this is called
        //concatenation
        c.println("Please enter a number");

        int num1 = c.readInt();

        c.println("Please enter another number");

        double num2 = c.readDouble();
        num2 = (int)num2;
        //This if statement first ask if the numbers are the same. 
        if (num1 == num2){ 
            //If they are the same I have to go through whether a number is 7. I only need to test one number, because in this case,  both numbers must be equal
            if(num1 == 7){ 
                c.println("lucky seven, jinx");
            }
            //If it doesn't have a 7, I need to see if both equals to 1.
            else if(num1 == 1 && num2 == 1){
                c.println("snake eyes, jinx");
            }
            //If the numbers don't have a 7 or a 1. I will just print jinx
            else{
                c.println("jinx");
            }
            }
        //I don't need to say when to print else, because the numberse have to be not equal now. 
        else{
            //If one number is 7, I will print luck seven
            if(num1 == 7 || num2 ==7){
                c.println("lucky seven");
            }
            else{
                c.println("You won nothing");
            }
            
        }
        







    }

            }
