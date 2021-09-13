package com.company;
import java.util.Random;
public class Main
{

    public static void main(String[] args)
    {
        Random rand = new Random();
        int max = 99;
        int min = 1;

        String [][] array1 = new String [5][5];

        //fill array
        for(int row = 0; row < array1.length; row++)
        {
            for(int col = 0; col < array1[row].length; col++)
            {
                array1[row][col] = String.valueOf(rand.nextInt((max - min) + 1) + min);
            }
        }

        //print array
        for(int row = 0; row < array1.length; row++)
        {
            for(int col = 0; col < array1[row].length; col++)
            {

                System.out.print(array1[row][col] + " ");
                array1[2][2] = "free";
            }
            System.out.println();
        }
    }
}
