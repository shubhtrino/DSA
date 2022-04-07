package BinarySearch;

import java.util.Arrays;

public class FindFrequencyOfTarget {
    public static void main(String[] args) {

        int[] a = {0, 1, 2, 2, 2, 2, 6, 7};

       FindFrequencyOfTarget findFrequencyOfTarget = new FindFrequencyOfTarget();

        int target =2;

        int first = findFrequencyOfTarget.findFirst(a, target, 0, a.length-1);

        int last = findFrequencyOfTarget.findLast(a, target, first, a.length - 1);

        System.out.println(Arrays.toString(a));
        System.out.println(first);
        System.out.println(last);
        System.out.println("target : "+target +" occured " + (last-first+1) + " times"); ;
    }



    int findFirst(int[] a , int target,int l , int r ){

        if(r>=l) {

            int mid = l + (r - l) / 2;
            if ((target > a[mid - 1]) && (target == a[mid])) {
                return mid;
            } else if (target > a[mid]) {
               return findFirst(a, target, mid + 1, a.length);
            } else {
                return findFirst(a, target, l, mid);
            }

        }
        return -1;

    }

    int findLast(int a[], int target, int l, int r){
        if(r>=l){
            int mid = l + (r - l) / 2;

            if(target<a[mid+1] && target==a[mid]){
                    return mid;
            }else if(target < a[mid]){
                return  findLast(a,target,l,mid-1);
            }else{
                return  findLast(a,target,mid,r);
            }
        }
        return -1;
    }
}
