package dev.milikkan.leetcode;

// problem link: https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder normalStr = new StringBuilder();
        StringBuilder reversedStr = new StringBuilder();
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
            if (Character.isLetterOrDigit(chars[i])) normalStr.append(chars[i]);
            if (Character.isLetterOrDigit(chars[j])) reversedStr.append(chars[j]);
        }

        return normalStr.toString().equals(reversedStr.toString());
    }

    public boolean isPalindrome2(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome palindrome = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome.isPalindrome(s));
        System.out.println(palindrome.isPalindrome2(s));

        s = "race a car";
        System.out.println(palindrome.isPalindrome2(s));

        s = " ";
        System.out.println(palindrome.isPalindrome2(s));

    }
}
