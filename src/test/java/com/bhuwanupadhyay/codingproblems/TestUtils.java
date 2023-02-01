package com.bhuwanupadhyay.codingproblems;

import java.util.HashSet;
import java.util.Set;

public class TestUtils {

    public static int[] anyArray(int maxLen, int minValue, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }
        return arr;
    }

    public static int[] uniqueArray(int maxLen, int minValue, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        Set<Integer> generated = new HashSet<>();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int num;
            do {
                num = (int) (Math.random() * (maxValue - minValue) + minValue);
            } while (generated.contains(num));
            arr[i] = num;
            generated.add(num);
        }
        return arr;
    }


    public static int[] duplicateArray(int maxLen, int minValue, int maxValue, int noOfDuplicates) {
        int len = (int) (Math.random() * maxLen);
        Set<Integer> generated = new HashSet<>();
        int[] arr = new int[len];
        for (int i = 0; i < len - noOfDuplicates; i++) {
            int num;
            do {
                num = (int) (Math.random() * (maxValue - minValue) + minValue);
            } while (generated.contains(num));
            arr[i] = num;
            generated.add(num);
        }

        for (int i = 0; i < noOfDuplicates; i++) {
            arr[len - noOfDuplicates + i] = arr[i];
        }
        return arr;
    }

}
