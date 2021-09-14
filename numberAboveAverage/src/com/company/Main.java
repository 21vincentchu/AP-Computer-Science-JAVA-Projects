package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int [] myArray = new int[10];
        int numTemp, average;
        int tempTotal = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        //add values to array
        for(int a = 0; a < myArray.length; a++)
        {
            System.out.println("Give me an temperature");
            numTemp = scan.nextInt();
            myArray[a] = numTemp;
        }
        //total value
        for(int i : myArray)
        {
            tempTotal += i;
        }

        //calculate average
        average = tempTotal / myArray.length;

        //print temperatures higher than average
        for(int c = 0; c < myArray.length; c++)
        {
            if(myArray[c] > average)
            {
                counter++;
                System.out.println(" temperature " + myArray[c] + " as above average");
            }
        }
        System.out.println("Average Temperature was: " + average);
        System.out.println("Days above average: " + counter);
    }
}
