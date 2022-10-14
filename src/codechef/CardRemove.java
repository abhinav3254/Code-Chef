package codechef;

import java.util.Scanner;

public class CardRemove {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ii=1;ii<=t;ii++)
        {
            int n=sc.nextInt();
            int count=0;
            int max=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    if(arr[i]==arr[j] )
                    {
                        count++;
                    }
                }
                if(count>max)
                {
                    max=count;

                }
                count=0;
            }
            if(max==n)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(n-max);
            }

        }
    }
}
