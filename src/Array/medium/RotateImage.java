package Array.medium;

public class RotateImage {

    public void rotate(int[][] matrix) {

        int len = matrix.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] =temp;
            }
        }

        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j] ;
                matrix[i][len-1-j] =temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
    }
}
