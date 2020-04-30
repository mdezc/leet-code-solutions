package DistinctIntegerPermutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctIntegerPermutations {

    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3 };
        List<List<Integer>> solution = new ArrayList<>();

        permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums.length; i++) {
            List<Integer> currentPermute = new ArrayList<>();
            currentPermute.add(list.get(i));
            List<List<Integer>> remaining = permuteRemaining(i, list);
        }
    }

    List<List<Integer>> permuteRemaining(int target, List<Integer> nums, List<Integer> subList, int size) {
        for (int i = 0; i < subList.size(); i++) {

        }

        if (subList.size() < )
    }

}


