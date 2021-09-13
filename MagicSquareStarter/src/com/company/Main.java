package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File text = new File("magicData.txt");
        Scanner scan = new Scanner(text);

        int count = 1; //count which square we're on

        int size = scan.nextInt(); //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1) {

            //create a new Square of the given size
            Square sq1 = new Square(size);

            //call its read method to read the values of the square
            sq1.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");
            //print the square
            sq1.printSquare();

            //print the sums of its rows
            System.out.println(sq1.sumRow());

            //print the sums of its columns
            System.out.println(sq1.sumCol());

            //print the sum of the main diagonal
            System.out.println(sq1.sumMainDiag());

            //print the sum of the other diagonal
            System.out.println(sq1.sumOtherDiag());

            //determine and print whether it is a magic square
            System.out.println("The square is magic?: " + sq1.magic());
            //get size of next square
            size = scan.nextInt();
            count++;
        }
    }
}
