package BinarySearch;

public class FindNoOfTimesArrayGotRotated {

    public static void main(String[] args) {

        int inputArr[] ={1,2,4,6,9,12};
        int rotatedArray[] = {4,6,9,12,1,2};
        //9,12,1,2,4,6

        int left =0;
        int right = rotatedArray.length-1;

        int rotationCount = findRotationCount(rotatedArray, left, right);

        System.out.println(rotationCount);
    }

    private static int  findRotationCount(int[] rotatedArray, int left, int right) {

        // if 0th element is less than last element means array never rotated
        // if mid > mid+1 thats the end of originnal array then count remaining from mid
        // if not
                // there are two cases
                // mid > last it means out put is n that range i.e from mid to last
                // mid < last it means output is in start to mid
        if(rotatedArray[0]<rotatedArray[rotatedArray.length-1]){
            return 0;
        }
        if(right>=left){

            int mid =left + (right -left) /2;

            if(rotatedArray[mid]> rotatedArray[mid+1]){
                return (rotatedArray.length-1)-mid;
            }else if( rotatedArray[mid] > rotatedArray[rotatedArray.length-1] ){
                return  findRotationCount(rotatedArray,mid,right);
            }else if(rotatedArray[mid] < rotatedArray[rotatedArray.length-1]){
                return  findRotationCount(rotatedArray,0,mid);
            }

        }

        return -1;
    }


}
