package dev.milikkan.leetcode;

import java.util.*;

// problem link: https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        int[] result = new int[k];
        for (int num : nums) {
            counts.putIfAbsent(num, 0);
            counts.put(num, counts.get(num) + 1);
        }

        int[][] freqs = new int[nums.length + 1][];

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int count = entry.getValue();
            if (freqs[count] == null) {
                freqs[count] = new int[1];
                freqs[count][0] = entry.getKey();
            } else {
                int currentSize = freqs[count].length;
                int[] newArr = new int[currentSize + 1];
                System.arraycopy(freqs[count], 0, newArr, 0, freqs[count].length);
                freqs[count] = newArr;
                freqs[count][currentSize] = entry.getKey();
            }
        }

        int count = 0;
        for (int i = freqs.length - 1; i > 0; i--) {
            if (freqs[i] != null) {
                for (int j = 0; j < freqs[i].length; j++) {
                    result[count] = freqs[i][j];
                    if (count + 1 == k) {
                        return result;
                    } else {
                        count++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 0};
//        int [] nums = {1,2};
        int k = 1;
//
        for (int n : topKFrequent(nums, k)) System.out.println(n);
        System.out.println();

    }
}
