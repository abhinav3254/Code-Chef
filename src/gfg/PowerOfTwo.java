package gfg;

public class PowerOfTwo {

    public static void main(String[] args) {
        boolean n = isPowerOfTwo(16);
        System.out.println(n);
    }

    public static boolean isPowerOfTwo(long n){

        // Your code here
        if (n==0) {
            return false;
        }

        while(n!=1) {
            if (n%2!=0) {
                return false;
            }
            n = n/2;
        }
         return true;
    }

    public static boolean isPowerOfThree(long n){

        // Your code here
        if (n==0) {
            return false;
        }

        while(n!=1) {
            if (n%3!=0) {
                return false;
            }
            n = n/3;
        }
        return true;
    }

    public static boolean isPowerOfFour(long n){

        // Your code here
        if (n==0) {
            return false;
        }

        while(n!=1) {
            if (n%4!=0) {
                return false;
            }
            n = n/4;
        }
        return true;
    }

}
