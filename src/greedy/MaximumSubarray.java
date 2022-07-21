package greedy;

/*
* Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
* */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int n : nums){
            sum += n;
            max = Math.max(max, sum);
            if(sum < 0){ //no need to carry negative sum as only positive numbers will give maximum
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray= new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

    }

}
