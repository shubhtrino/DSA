package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class FindInterSectionOfTwoArrays {
    public static void main(String[] args) {

        int[] nums1 ={4,7,9,7,6,7};
        int[] nums2 ={5,0,0,6,1,6,2,2,4};
        int[] result = findInterSection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findInterSection(int[] nums1, int[] nums2) {

        HashSet<Integer> hash = new HashSet();
        for (int j : nums1) {
            hash.add(j);
        }


        HashSet<Integer> result = new HashSet();
        for (int j : nums2) {
            if (hash.contains(j)) {
                result.add(j);
            }
            ;
        }


        int[] arr = new int[result.size()];
        int i=0;
        for(Integer val : result) arr[i++]=val;

        return arr;
    }
}
