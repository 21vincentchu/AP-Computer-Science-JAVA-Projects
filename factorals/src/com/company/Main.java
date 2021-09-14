package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int number;
        int factoral = 1;
        int i = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number");
        number = scan.nextInt();

        //number is 0
        if(number == 0)
        {
            factoral = 1;
            System.out.println("The factoral of " + number + " is " + factoral);
        }

        //number is negitive
        while(number < 0)
        {
            System.out.println("A positive number is required, type another number");
            number = scan.nextInt();
        }

        //number is positive
        while(i <= number)
        {
            factoral = factoral * i;
            i++;
        }
        System.out.println("The factoral of " + number + " is " + factoral);
    }
}
