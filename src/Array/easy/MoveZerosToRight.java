package Array.easy;


import java.util.Arrays;

/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
public class MoveZerosToRight {

    public void moveZeroes(int[] nums) {

//approach one
//         int n=0;
//         int i=0;

//         while(n<nums.length){
//             if(nums[n]!=0){
//                 nums[i]=nums[n];
//                 i++;
//             }
//             n++;
//         }
//         for(int k=i;k<nums.length;k++){
//             nums[k]=0;
//         }

        //approach 2
        if(nums.length==0 || nums==null) return;

        int diff =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                diff++;
            }
            else if(diff>0){
                int t= nums[i];
                nums[i-diff]=t;
                nums[i]=0;
            }
        }


        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        MoveZerosToRight moveZerosToRight = new MoveZerosToRight();
        moveZerosToRight.moveZeroes(new int[] {0,1,0,3,12});
    }
}
