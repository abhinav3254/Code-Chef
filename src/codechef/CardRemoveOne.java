package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardRemoveOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] num;
        while (t-->0) {

            int n = Integer.parseInt(br.readLine());

            num = br.readLine().split(" ");
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(num[i]);
            }

            var count = 0;
            var max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i;j<n;j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count>max) {
                    max = count;
                }
                count = 0;
            }

            if (max==n) {
                System.out.println("0");
            } else {
                System.out.println(n-max);
            }
        }
    }
}
