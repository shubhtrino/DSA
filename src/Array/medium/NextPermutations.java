package Array.medium;

public class NextPermutations {

    public void nextPermutation(int[] nums) {

        if(nums.length==1 || nums==null) return;

        int i =nums.length-2;

        while( i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j= nums.length-1;
            while(nums[j] <= nums[i]) j--;
            swap(i,j,nums);
        }
        reverse(nums, i + 1, nums.length - 1);
    }
    void swap(int i,int j,int[] nums){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j] = t;
    }

    public void reverse(int[] nums, int i, int j) {
        while(i < j) swap( i++, j--,nums);
    }

    public static void main(String[] args) {
        NextPermutations nextPermutations = new NextPermutations();
         nextPermutations.nextPermutation( new int[] {1,3,5,4,2});
    }
}
