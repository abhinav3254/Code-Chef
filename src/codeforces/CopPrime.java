package codeforces;

import java.util.Scanner;

public class CopPrime {
    static int __gcd(int a, int b)
    {
        if (a == 0 || b == 0)
            return 0;

        if (a == b)
            return a;

        if (a > b)
            return __gcd(a-b, b);

        return __gcd(a, b-a);
    }

    static boolean coPrime(int a, int b) {

        if ( __gcd(a, b) == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    static int finalAnswer = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    boolean ans = coPrime(arr[i],arr[j]);
                    if (ans) {
                        finalAnswer = i+j+2;
                    }
                }
            }
            System.out.println(finalAnswer);
            finalAnswer = -1;
        }

    }
}
