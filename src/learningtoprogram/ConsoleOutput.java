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
public class ConsoleOutput{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();			//
        c.println(1);					//you can print numbers (notice not quotes)
        c.println(3.14159);				//you can print numbers with decimals
        c.println(25/5);				//you can do basic math in the printlns
        c.println("Happy " + 1 + " st Birthday");  //you can combine things with +, this is called
                                                        //concatenation
   
        

    }

}
