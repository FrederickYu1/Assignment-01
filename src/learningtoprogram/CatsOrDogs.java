/*
 * Author: Frederick Yu
 * Class: ISC4U
 * Pogram: CatsorDogs
 * Input: I will be inputting a code to decided if you are a cat or dog person
 * Output: I will be outputting if you are a dog or cat person
 */
package learningtoprogram;

import hsa.*;
import boardGame.*;
import becker.robots.*;

/**
 *
 * @author Frederick Yu
 */
public class CatsOrDogs{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
        int home;
        int bookOrWatch;
        int jazzOrWild;
        c.println("Do you prefer to stay at home alone or go out? Please enter 1 for stay at home or 2 for go out.");
        home = c.readInt();
        if(home == 1){
            c.println("Do you prefer to read a book or watch tv? Enter 1 for read a book or 2 for watch tv.");
            bookOrWatch = c.readInt();
                    if(bookOrWatch == 1){
                        
                    }
        }
    }

}