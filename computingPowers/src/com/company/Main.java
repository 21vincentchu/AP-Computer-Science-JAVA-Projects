package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int base, exp;
        int answer;

        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the power program! ");
        System.out.println("Please use integers only!");

        //get base
        System.out.println("Enter the base you would like raised to a power: ");
        base = scan.nextInt();

        //get exponent
        System.out.println("Enter the power you would like raised to a power:");
        exp = scan.nextInt();

        answer = power(base, exp);
        System.out.println(base + " Raised to the " + exp + " is " + answer);
    }
    //computes and returns base^exp
    public static int power(int base, int exp)
    {
        if(exp <= 0)
        {
            return 1;
        }
        else
        {
            return base * power(base, exp - 1);
        }
    }
}
