package codechef;

import java.util.Scanner;

public class SingleOp1 {
    public static void main(String[] args) {
        int T;
        Scanner sn=new Scanner(System.in);
        T=sn.nextInt();
        for(int i=0; i<T; i++)
        {
            int k=0;
            int X = sn.nextInt();
            sn.nextLine();  // Consume newline left-over
            String S = sn.nextLine();
            // System.out.println(S);
            for(int j=0; j<S.length(); j++){
                if(S.charAt(j) == '1')
                    k++;
                else
                    break;
            }
            System.out.println(k);
        }
    }
}
