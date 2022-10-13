package codeforces;

import java.util.Scanner;

public class Scuza {
    static long sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-->0) {

            long n = sc.nextLong();
            long q = sc.nextLong();

            long[] step = new long[(int) n];
            long[] leg = new long[(int) q];

            for (int i = 0; i < n; i++) {
                step[i] = sc.nextLong();
            }

            for (int i = 0; i < q; i++) {
                leg[i] = sc.nextLong();
            }

            for (int i = 0; i < leg.length; i++) {
                for (int j = 0; j < step.length; j++) {
                    if (leg[i]>=step[j]) {
                        sum = sum+step[j];
                    } else {
                        break;
                    }
                }
                System.out.print(sum+" ");
                sum = 0;
            }
            System.out.println();

        }
    }
}
