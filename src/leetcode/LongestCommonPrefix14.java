package leetcode;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geek",
                "geek", "geezer"};
        LongestCommonPrefix14 prefix14 = new LongestCommonPrefix14();
        System.out.println(prefix14.longestCommonPrefix(arr));
    }
    public String longestCommonPrefix(String[] arr) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix = longestCommonPrefixUtil(prefix,arr[i]);
        }
        return prefix;
    }
    public String longestCommonPrefixUtil(String prefix,String str) {
        String ans = "";
        int n1 = prefix.length();
        int n2 = str.length();
        int len = Math.min(n1, n2);
        for (int i = 0; i < len; i++) {
            if (prefix.charAt(i) == str.charAt(i)) {
                ans = ans+str.charAt(i);
            } else {
                break;
            }
        }
        return ans;
    }
}
