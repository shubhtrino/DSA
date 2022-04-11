package BinarySearch;

public class FindTargetInRotatedArray {

    public static void main(String[] args) {

        int[] rotatedArray = {3,5,6,8,9,1,2};
        int target =1;
        int left=0;
        int right = rotatedArray.length-1;

        int targetInRotatedArray = findTargetInRotatedArray(rotatedArray, target, left, right);

        System.out.println(targetInRotatedArray);
    }

    private static int findTargetInRotatedArray(int[] nums, int target, int left, int right) {

        if(left<=right){
            int mid = left + (right -left)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[left] <= nums[mid]){
                if(target>=nums[left] && target<=nums[mid]){
                    return findTargetInRotatedArray(nums,target,left,mid-1);
                }
                return findTargetInRotatedArray(nums,target,mid+1,right);

            }
            if(target>=nums[mid] && target <= nums[right]){
                return findTargetInRotatedArray(nums,target,mid+1,right);
            }
            return findTargetInRotatedArray(nums,target,left,mid-1);

        }
        return -1;
    }
}
