package com.company;
import java.util.Scanner;

public class Square
{
    int[][] square;


    public Square(int size)
    {
        square = new int[size][size];
    }

    public int sumRow()
    {
        int sumRow = 0;
        for(int row = 0; row < square.length; row++)
        {
            for(int col = 0; col < square[0].length; col++)
            {
                sumRow += square[row][col];
            }
        }
        return sumRow;
    }

    public int sumCol()
    {
        int sumCol = 0;
        for(int col = 0; col < square[0].length; col++)
        {
            for(int row = 0; row < square.length;row++)
            {
                sumCol += square[row][col];
            }
        }
        return sumCol;
    }

    public int sumMainDiag()
    {
        int sumMainDiag = 0;
        for(int row = 0; row < square.length;row++)
        {
            sumMainDiag = sumMainDiag + square[row][row];
        }
        return sumMainDiag;
    }

    public int sumOtherDiag()
    {
        int sumOtherDiag = 0;
        for(int row = 0; row < square.length; row++)
        {
            sumOtherDiag = sumOtherDiag + square[row][square.length - 1 - row];
        }
        return sumOtherDiag;
    }

    public boolean magic()
    {
        if(sumRow() == sumCol() && sumMainDiag() == sumOtherDiag())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col ++)
                square[row][col] = scan.nextInt();
    }

    public void printSquare()
    {
        for(int row = 0; row < square.length; row++)
        {
            for(int col = 0; col < square.length; col++)
            {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
    }
}
