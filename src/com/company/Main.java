package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Declare one 8 and one 12 sided die called d08 and d12
        //	Roll the dice until the dice values for a single roll add up to 10
        //	Print out each roll, and when done, print the number of rolls required

        Dice2 d08 = new Dice2();
        Dice2 d12 = new Dice2();
        d08.sides(6);
        d12.sides(6);

        int i = 0;
         while (i !=10)
         {
             d08.roll();
             System.out.println("Dice 1 :: " + d08.LastRoll());
             d12.roll();
             System.out.println("Dice 2 :: " + d12.LastRoll());

             if (d08.LastRoll() + d12.LastRoll() == 10)
             {
                 System.out.println("You have rolled a 10!");
                 System.out.println("Number of roles required :: " + d08.numRoll());
                 i = 10;
             }
             System.out.println("");
         }
    }
}
