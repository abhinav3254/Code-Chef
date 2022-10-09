package gfg;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(reverseWord(str));
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder newStr = new StringBuilder();
        int len = str.length();

        for (int i = len-1; i >= 0; i--) {
         newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
