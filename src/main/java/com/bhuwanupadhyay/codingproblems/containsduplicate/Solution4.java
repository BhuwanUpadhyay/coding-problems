package com.bhuwanupadhyay.codingproblems.containsduplicate;

import java.util.HashSet;

class Solution4 {

    public boolean containsDuplicate(int[] nums) {
        var sets = new HashSet<>(nums.length);
        for (var num : nums) {
            if (sets.contains(num)) {
                return true;
            }
            sets.add(num);
        }
        return false;
    }

}
