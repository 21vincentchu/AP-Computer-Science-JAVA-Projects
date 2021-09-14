package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int lengthOfArray, numToAdd;
        double sum = 0;
        double percentNum;
        Scanner scan = new Scanner(System.in);

        //length of array
        System.out.println("How many integers will you enter?");
        lengthOfArray = scan.nextInt();

        //initlaize array
        int [] myArray = new int[lengthOfArray];

        //add values to the array
        for(int a = 0; a < myArray.length; a++)
        {
            System.out.println("Give me an integer:");
            numToAdd = scan.nextInt();
            myArray[a] = numToAdd;

        }

        //calculate and print sum
        for(int b = 0; b < myArray.length; b++)
        {
            sum += b;
        }
        System.out.println("The total sum of intergers in array is" + sum);

        //calculate percentage of sum and print
        for(int c = 0; c < myArray.length; c++)
        {
            percentNum = myArray[c] / sum;
            System.out.println(myArray[c] + ", Which is " + percentNum + "% of the sum");
        }
    }
}
