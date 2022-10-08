package Practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class One {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int bal = sc.nextInt();
            int[] arr = new int[n];

//            Here K is the total amount in the ATM
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

//            System.out.println(Arrays.toString(arr));

            String bin = "";

            for (int i = 0; i < arr.length; i++) {
                int val = arr[i];
                if (bal>=val) {
                    bal = bal-val;
                    bin = bin+1;
                } else {
                    bin = bin+0;
                }
            }

            System.out.println(bin);

        }
    }
}
