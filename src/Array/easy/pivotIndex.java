package Array.easy;

public class pivotIndex {
/*
*Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
*
*
* Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
* */
    public int pivotIndex(int[] A) {
        int left = 0, sum = 0;
        for(int i=0;i<A.length;i++) {
            sum += A[i];
        }
        for(int i=0;i<A.length;i++) {
            sum -= A[i];
            if(sum == left) return i;
            left += A[i];
        }
        return -1;
        // TC : O(N)
        // SC : O(1)
    }

    public static void main(String[] args) {
        pivotIndex pivotIndex = new pivotIndex();
        pivotIndex.pivotIndex(new int[]{1,7,3,6,5,6});
    }
}
