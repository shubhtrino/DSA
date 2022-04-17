package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageOfSubarrayOfSizeK {
    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of sub-arrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverages(int i, int[] ints) {
        int start=0;
        double sum=0;
        double[] result = new double[ints.length-i+1];
        for(int windowEnd=0 ;windowEnd<ints.length;windowEnd++){
            sum+=ints[windowEnd];
            if(windowEnd>=i-1){
                result[start]=sum/i;
                sum-=ints[start++];
            }
        }
        return result;
    }

}
