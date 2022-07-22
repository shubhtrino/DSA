package greedy;

import java.util.Map;
import java.util.TreeMap;
/*Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.

Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.


Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]

*/
public class HandOfStraights {

    public boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length % groupSize!=0) return false;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int a: hand) map.put(a,map.getOrDefault(a,0)+1);


        while(map.size()>0){
            Map.Entry<Integer, Integer> val = map.entrySet().stream().findFirst().get();
            for(int i=0;i<groupSize;i++){
                int cur = val.getKey()+i;
                if(!map.containsKey(cur)) return false;
                map.put(cur,map.get(cur)-1);
                if(map.get(cur)<1) map.remove(cur);

            }
        }

        return true;

        // approach 2 and faster approach

        /*
          PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : hand){
            minHeap.add(i);
        }
        while(minHeap.size() != 0) {
            int start = minHeap.poll();
            for(int j = 1; j < groupSize; j++){
                if(minHeap.remove(start + j)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }*/
    }
    public static void main(String[] args) {
        HandOfStraights handOfStraights = new HandOfStraights();
        boolean nStraightHand = handOfStraights.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3);
        System.out.println(nStraightHand);
    }
}
