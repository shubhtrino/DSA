package greedy;

public class JumpGame2 {

    /*
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.*/
    public int jump(int[] nums) {

        int maxLad =0;
        int cEnd =0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            maxLad= Math.max(maxLad,i+nums[i]);
            if(i==cEnd){
                jump++;
                cEnd=maxLad;
            }
        }
        return jump;

    }

    public static void main(String[] args) {
        JumpGame2 jg= new JumpGame2();
        int jump = jg.jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(""+jump);
    }
}
