package org.example;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */

public class Main
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String word = inp.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) != ' ')
                count++;
        }

        System.out.println("" + word + " has " + count + " characters.");
    }
}
