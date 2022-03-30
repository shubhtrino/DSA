package BinarySearch;

public class SearchAndSort {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,6};
        int target =5;
        System.out.println(binarySearch(a,target));
    }

    private static int binarySearch(int[] nums, int target) {
        int l=0,r=nums.length-1,mid,result=0;

        while(l<=r){
            mid = l + (r-l) / 2;
            System.out.println("mid:"+nums[mid]);
            System.out.println("target:"+target);

            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                r=mid-1;
                result = mid;
                System.out.println("target < mid:"+r);
            } else {
                l=mid+1;
                result =mid+1;
                System.out.println("target > mid:"+l);
            }
        }

        System.out.println("r:"+result);
        return result;

    }
}
