package dev.milikkan.leetcode;

// problem link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;

        for (int i = arr.length - 1; i > 0; i--) {
            result[i - 1] = Math.max(arr[i], result[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

        for (int num : replaceElements(arr)) System.out.print(num + " ");

        System.out.println("\n-----------");

        int[] arr2 = {400};
        for (int num : replaceElements(arr2)) System.out.print(num + " ");
    }
}
