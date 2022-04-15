package BinarySearch;

public class FindPeak {

    // peak mean number should be greater that its neighbors.
    //corner cases if number is at left corner then it will compare with right one
    // wise versa for right one
    public static void main(String[] args) {

        int[] nums = {1,2,1,3,5,6,4};
        int peak = findPeak(0, nums.length, nums);
        System.out.println(peak);
    }

    //if mid > both left and right return mid
    // if mid-1 > mid then peak will be on left side
    // if mid+1 > mid then peak will be ata right side
    private static int  findPeak(int left, int right, int[] nums) {
        int mid = left + (right -left)/2;
        if( (mid==0 || nums[mid]>nums[mid-1] ) && (mid == nums.length-1 || nums[mid] > nums[mid+1]) ){
            return mid;
        }else if( mid>0 && nums[mid] < nums[mid-1] ){
            return findPeak(left,mid-1,nums);
        }else {
            return findPeak(mid+1,right,nums);
        }
    }
}
