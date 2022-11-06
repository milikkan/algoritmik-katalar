package dev.milikkan.leetcode;

// problem link: https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int index = 0;
        for (char letter : t.toCharArray()) {
            if (letter == s.charAt(index)) index++;
            if (index == s.length()) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";

        System.out.println(isSubsequence(s, t));

        s = "abc";
        t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
