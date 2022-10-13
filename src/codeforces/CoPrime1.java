package codeforces;

public class CoPrime1 {
    static int __gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0 || a==1 || b == 1)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return __gcd(a-b, b);

        return __gcd(a, b-a);
    }

    // function to check and print if
    // two numbers are co-prime or not
    static void coprime(int a, int b) {

        if ( __gcd(a, b) == 1)
            System.out.println("Co-Prime");
        else
            System.out.println("Not Co-Prime");
    }

    //driver code
    public static void main (String[] args)
    {
        int a = 1, b = 5;
        coprime(a, b);

        a = 8; b = 16;
        coprime(a, b);
    }
}
