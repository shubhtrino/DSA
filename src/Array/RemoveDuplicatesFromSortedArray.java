package Array;

public class RemoveDuplicatesFromSortedArray {

    /*
    Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Use the same array
*/

    public int removeDuplicates(int[] nums) {

//         LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
//         for(int c: nums){
//                 map.put(c,1);
//         }

//         int count =0;
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             nums[count]=entry.getKey();
//             count+=1;
//         }


        int curValue=Integer.MAX_VALUE;
        int count=0;
        for(int num: nums){
            if(curValue!=num){
                nums[count++]=num;
                curValue=num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        rdfsa.removeDuplicates(new int[]{1,2,2});
    }
}
