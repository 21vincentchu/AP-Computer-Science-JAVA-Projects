package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        String status = "r";
        String unit;
        double temp,input;
        Scanner scan = new Scanner (System.in);

        while (status.equalsIgnoreCase("q")==false)
        {
            System.out.println("input temperature");
            temp = scan.nextDouble();
            System.out.println("input temperature unit C or F");
            scan.nextLine();
            unit = scan.nextLine();
            unit = unit.toUpperCase();

            if (unit.equalsIgnoreCase("C")== false && unit.equalsIgnoreCase("F") == false)
            {
                while (unit.equalsIgnoreCase("C")== false || unit.equalsIgnoreCase("F") == false)
                {

                    System.out.print("invalid unit, input new unit\n");

                    unit = scan.nextLine();
                    unit = unit.toUpperCase();
                    if (unit.equalsIgnoreCase("C")== true||unit.equalsIgnoreCase("F") == true){
                        break;
                    }
                }
            }

            if (unit.equalsIgnoreCase ("F")){
                temp -=32;
                temp*=5;
                temp/=9;
                System.out.println(temp +"C");
            }

            if (unit.equalsIgnoreCase ( "C")){
                temp *=9;
                temp/=5;
                temp+=32;
                System.out.println(temp +"F");
            }

            System.out.println("enter q to quit, press enter to continue");

            status = scan.nextLine();



        }
    }
}
