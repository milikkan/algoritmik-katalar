package dev.milikkan.leetcode;

// problem link: https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static int lengthOfLastWord2(String s) {
        StringBuilder lastWord = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && lastWord.length() == 0) continue;
            if (s.charAt(i) == ' ') break;
            lastWord.append(s.charAt(i));
        }

        return lastWord.length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord2(s));
    }
}
