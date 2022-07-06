package BinarySearch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindClosestElements {

    public static void main(String[] args) {
        int[] nums = {10, 12, 15, 17, 18, 20, 25 };
        int target = 16, k = 3;

        System.out.println(findClosestElements(nums, k, target));
    }

    public static List<Integer> findClosestElements(int[] nums, int k, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (right - left >= k)
        {
            if (Math.abs(nums[left] - target) > Math.abs(nums[right] - target)) {
                left++;
            }
            else {
                right--;
            }
        }

        return Arrays.stream(nums, left, right + 1).boxed()
                .collect(Collectors.toList());
    }
}
