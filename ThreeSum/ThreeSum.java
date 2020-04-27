package ThreeSum;

import java.util.*;

class ThreeSum {

    public static void main(String[] args) {
        threeSum(new int[]{-2, 1, 1});
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> threeSumSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int numToSum = nums[i];
            int front = i + 1;
            int tail = nums.length - 1;

            while (front < tail) {
                if (front > i + 1 && nums[front] == nums[front - 1]) {
                    front++;
                    continue;
                }
                if (tail < nums.length - 1 && nums[tail] == nums[tail + 1]) {
                    tail--;
                    continue;
                }
                if (-numToSum == nums[tail] + nums[front]) {
                    ArrayList<Integer> threeSum = new ArrayList<>();
                    threeSum.add(numToSum);
                    threeSum.add(nums[tail]);
                    threeSum.add(nums[front]);
                    threeSumSet.add(threeSum);
                    tail--;
                    front++;
                } else if (-numToSum < nums[front] + nums[tail]) {
                    tail--;
                } else {
                    front++;
                }
            }
        }
        return new ArrayList<>(threeSumSet);
    }

}