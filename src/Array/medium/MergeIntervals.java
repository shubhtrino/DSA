package Array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        int[] newInterval =intervals[0];
        result.add(newInterval);
        for(int[] num : intervals){
            if(num[0]<=newInterval[1]){
                newInterval[1]=Math.max(newInterval[1], num[1]);
            }else{
                newInterval =num;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] merge = mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println(Arrays.deepToString(merge));
    }
}
