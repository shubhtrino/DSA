package Array.easy;

/*Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].*/
public class sortedSquares {
    public int[] sortedSquares(int[] nums) {

        int n =nums.length;
        int[] result = new int[n];
        int li=0;
        int ri=n-1;


        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[li]) > Math.abs(nums[ri])){
                result[i]=nums[li]*nums[li];
                li++;
            }else{
                result[i]=nums[ri]*nums[ri];
                ri--;
            }
        }

        return result;

    }

}
