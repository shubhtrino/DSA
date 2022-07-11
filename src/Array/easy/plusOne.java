package Array.easy;


/*
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/


import java.util.Arrays;

public class plusOne {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1 ;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] result= new int[n+1];
        result[0]=1;
        return result;

    }

    public static void main(String[] args) {
        plusOne plusOne= new plusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9, 9})));
    }
}
