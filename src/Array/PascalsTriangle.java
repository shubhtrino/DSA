package Array;

import java.util.ArrayList;
import java.util.List;

/*
 Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
* */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < i + 1 ; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    list.add(a + b);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
            PascalsTriangle pascalsTriangle = new PascalsTriangle();
            pascalsTriangle.generate(5);
    }
}


