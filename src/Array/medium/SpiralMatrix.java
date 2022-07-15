package Array.medium;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res =  new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int up=0;
        int down =n-1;
        int left =0;
        int right =m-1;

        while(res.size() <  m*n){

            for(int i=left;i<=right && res.size()< m*n;i++)
                res.add(matrix[up][i]);


            for(int j=up+1;j<=down-1 && res.size()< m*n;j++)
                res.add(matrix[j][right]);

            for(int i=right;i>=left && res.size()< m*n;i--)
                res.add(matrix[down][i]);


            for(int j=down-1;j>=up+1 && res.size()< m*n;j--)
                res.add(matrix[j][left]);

            left++;right--;up++;down--;

        }

        return res;

    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.spiralOrder(new int[][] { {1,2,3} ,{4,5,6} ,{7,8,9}});
    }
}
