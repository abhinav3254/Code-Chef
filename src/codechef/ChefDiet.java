package codechef;


import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int rem = 0;

        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                rem = rem+arr[i];
                if (rem>=k) {
                    rem = rem-k;
                } else {
                    System.out.println("NO "+(i+1));
                    c = 1;
                    break;
                }
            }
            if (c==0) {
                System.out.println("YES");
            }

        }
    }
}
