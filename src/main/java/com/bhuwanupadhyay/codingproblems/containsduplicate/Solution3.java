package com.bhuwanupadhyay.codingproblems.containsduplicate;

import java.util.HashMap;
import java.util.Map;

class Solution3 {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (var num : nums) {
            var count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }

        return false;
    }

}
