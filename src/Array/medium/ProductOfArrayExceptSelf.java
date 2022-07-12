package Array.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
    *
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
24=2*3*4,12=1*3*4
* */

    public int[] productExceptSelf(int[] nums) {

        int[] res= new int[nums.length];
        int n =nums.length;

        int left=1;
        for(int i=0;i<n;i++){
            if(i>0)
                left*=nums[i-1];
            res[i]=left;
        }

        int right=1;
        for(int i=n-1;i>=0;i--){
            if(i<n-1)
                right*=nums[i+1];
            res[i] =res[i] * right;
        }

        return res;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf poaes = new ProductOfArrayExceptSelf();
        int[] ints = poaes.productExceptSelf(new int[]{2, 3, 4, 5});
        System.out.println(Arrays.toString(ints));
    }
}
