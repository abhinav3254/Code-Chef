package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums;

//        int t = sc.nextInt();
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            strNums = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strNums[i]);
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
