package Array;

/*Input: nums = [3,2,3]
Output: 3*/

public class MajorityElement {

    public int majorityElement(int[] nums) {

//         Map<Integer,Integer> map= new HashMap<>();

//         for(int num:nums){
//             if(map.containsKey(num)){
//                 map.put(num,map.get(num)+1);
//             }else{
//                 map.put(num,1);
//             }
//         }

//         int majNum =0;
//         int key =-1;
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             if(entry.getValue()> majNum){
//                 majNum=entry.getValue();
//                                 key=entry.getKey();

//             }
//         }

//         return key;

        int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;

        }
        return major;

    }
    public static void main(String[] args) {
            MajorityElement majorityElement = new MajorityElement();
            majorityElement.majorityElement(new int[] {3,2,4,3,3});
    }
}
