package codechef;

import java.util.Scanner;

public class WeightBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                var w1 = sc.nextInt();
                var w2 = sc.nextInt();
                var x1 = sc.nextInt();
                var x2 = sc.nextInt();
                int m = sc.nextInt();

                int weightGain = w2 - w1;
                if ((weightGain >= m * x1) && (weightGain <= m * x2)) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }

    }
}
