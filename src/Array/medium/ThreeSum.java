package Array.medium;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0)k--;
                else if(sum<0)j++;
                else{
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--])) ;
                }
            }

        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> lists = ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists.toString());
    }
}
