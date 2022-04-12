package BinarySearch;

public class FindSqrt {

    public static void main(String[] args) {

        int x =8;
        int left =1;
        int sqrt = findSqrt(x, left, x);
        System.out.println(sqrt);
    }

    private static int findSqrt(int x, int left, int right) {

        int ans=-1;
        while(left<=right){

            int mid =left + (right -left)/2;

            if(mid*mid == x){
                return mid;
            }
            if(mid >= x/mid){
                right =mid-1;
            }
            if(mid<= x/mid){
                left = mid+1;
                ans =mid;

            }
        }

        return ans;

    }
}
