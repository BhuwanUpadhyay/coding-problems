package com.bhuwanupadhyay.codingproblems.containsduplicate;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.bhuwanupadhyay.codingproblems.TestUtils.duplicateArray;
import static com.bhuwanupadhyay.codingproblems.TestUtils.uniqueArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionsTests {

    public static final int MAX_LEN = (int) (1 * Math.pow(10, 5));
    public static final int MIN_VALUE = (int) (1 * Math.pow(10, -9));
    public static final int MAX_VALUE = (int) (1 * Math.pow(10, 9));

    private static Stream<Arguments> simple() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }

    private static Stream<Arguments> constrains() {
        return Stream.of(
                Arguments.of(duplicateArray(MAX_LEN, MIN_VALUE, MAX_VALUE, 5), true),
                Arguments.of(uniqueArray(MAX_LEN, MIN_VALUE, MAX_LEN), false)
        );
    }

    @ParameterizedTest
    @MethodSource("simple")
    void checkSimpleSolution1(int[] input, boolean expected) {
        assertEquals(expected, new Solution1().containsDuplicate(input));
    }

    @ParameterizedTest
    @MethodSource("simple")
    void checkSimpleSolution2(int[] input, boolean expected) {
        assertEquals(expected, new Solution2().containsDuplicate(input));
    }


    @ParameterizedTest
    @MethodSource("simple")
    void checkSimpleSolution3(int[] input, boolean expected) {
        assertEquals(expected, new Solution3().containsDuplicate(input));
    }

    @ParameterizedTest
    @MethodSource("simple")
    void checkSimpleSolution4(int[] input, boolean expected) {
        assertEquals(expected, new Solution4().containsDuplicate(input));
    }

    @ParameterizedTest
    @MethodSource("constrains")
    void checkWithConstraintsSolution1(int[] input, boolean expected) {
        assertEquals(expected, new Solution1().containsDuplicate(input));
    }


    @ParameterizedTest
    @MethodSource("constrains")
    void checkWithConstraintsSolution2(int[] input, boolean expected) {
        assertEquals(expected, new Solution2().containsDuplicate(input));
    }


    @ParameterizedTest
    @MethodSource("constrains")
    void checkWithConstraintsSolution3(int[] input, boolean expected) {
        assertEquals(expected, new Solution3().containsDuplicate(input));
    }


    @ParameterizedTest
    @MethodSource("constrains")
    void checkWithConstraintsSolution4(int[] input, boolean expected) {
        assertEquals(expected, new Solution4().containsDuplicate(input));
    }


}