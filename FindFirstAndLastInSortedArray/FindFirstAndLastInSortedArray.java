package FindFirstAndLastInSortedArray;

import java.util.Arrays;

public class FindFirstAndLastInSortedArray {

    public static void main(String[] args) {

        int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        assert Arrays.equals(new int[] { 3, 4 }, searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] foundPositions = new int[2];

        int lower = binarySearch(true, nums, target, );
        return foundPositions;
    }

    private static int binarySearch(boolean lower, int[] nums, final int target) {
        int lowest = -1;
        int highest = -1;
        int start = 0;
        int finish = nums.length;

        do {
            int mid = nums.length / 2;
            if (nums[finish] == target) {
                lowest = target;
            }

        } while ( finish - start > 1);

        //
        return 0;
    }
}

