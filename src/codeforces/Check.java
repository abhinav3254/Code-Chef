package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check {
    public static void main(String[] args)
            throws IOException
    {


        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        // Custom integer array of size 10
        int num[] = new int[10];
        // Array of string type to store input
        String[] strNums;

        // Display message
        System.out.println("enter string of numbers");

        // Reading input a string
        strNums = bi.readLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }

        // Display message
        System.out.println("printing stored numbers ");

        // Printing the stored numbers using for loop
        for (int i = 0; i < strNums.length; i++) {
            System.out.println(num[i]);
        }
    }
}
