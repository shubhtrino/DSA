package BinarySearch;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {

        int num[] ={5,6,9,12,1};
                //9,12,1,5,6 12 is mid
        int minimum = findMinimum(num, 0, num.length - 1);

        System.out.println(minimum);
    }

    private static int findMinimum(int[] nums, int left, int right) {
        if(left<=right){

            int mid = left + (right -left) /2;

            if(nums[mid] > nums[mid+1] ){
                return nums[mid+1];
            }else if( nums[mid] > nums[right]){
                return findMinimum(nums,mid+1,right);
            }else if(nums[mid] < nums[right]){
                return findMinimum(nums,left,mid);
            }

        }


        return nums[0];
    }
}
