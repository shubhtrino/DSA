package BinarySearch;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target =8;
        int first = findFirst(nums, target);
        int second = findLast(nums, target);

        System.out.println("first position: "+ first + " second position "+ second);
    }

    static int findFirst(int[] nums, int target){
        int left =0;
        int right =nums.length-1;
        int res =-1;

        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]>target){
                right =mid-1;
            }else if(nums[mid]< target){
                left = mid+1;
            }else{
                res =mid;
                right=mid-1;
            }
        }
    return res;
    }

    static int findLast(int[] nums, int target){
        int left =0;
        int right =nums.length-1;

        int res =-1;
        while(left<=right){
            int mid =(left + right)/2;

            if(nums[mid]>target){
                right =mid-1;
            }else if(nums[mid]< target){
                left = mid+1;
            }else{
                res =mid;
                left=mid+1;
            }
        }
        return res;
    }
}
