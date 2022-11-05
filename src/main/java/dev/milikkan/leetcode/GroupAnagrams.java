package dev.milikkan.leetcode;

import java.util.*;

// problem link: https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {

            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sorted = Arrays.toString(letters);

            if (result.containsKey(sorted)) {
                result.get(sorted).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                result.put(sorted, list);
            }
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        GroupAnagrams anagrams = new GroupAnagrams();

        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagrams.groupAnagrams(words));

        String[] words2 = {""};
        System.out.println(anagrams.groupAnagrams(words2));

        String[] words3 = {"a"};
        System.out.println(anagrams.groupAnagrams(words3));

    }
}
