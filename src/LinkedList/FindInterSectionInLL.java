package LinkedList;

import LinkedList.Utility.LLUtility;

import java.util.Arrays;

public class FindInterSectionInLL {
    public static void main(String[] args) {

        Node linkedList = LLUtility.createLinkedList(Arrays.asList(1, 4, 6, 7, 8, 9));
        Node linkedList2 = LLUtility.createLinkedList(Arrays.asList(2, 3));

        linkedList2.next.next=linkedList.next.next.next;

        Node intersectionNode = getIntersectionNode(linkedList, linkedList2);

        if(intersectionNode!=null){
            System.out.println(intersectionNode.data);
        }else {
            System.out.println("No intersection found");
        }
    }

    public static Node getIntersectionNode(Node headA, Node headB) {

        Node tempHeadA =headA;
        Node tempHeadB =headB;

        int count1 = getCount(headA);
        int count2 = getCount(headB);

        int step= Math.abs(count1-count2);

        Node upHeadA=tempHeadA;
        Node upHeadB=tempHeadB;

        if(count1>count2){
            upHeadA = incrementByGivenStep(tempHeadA,step);
        }else{
            upHeadB = incrementByGivenStep(tempHeadB,step);
        }


        return findIntersect(upHeadA,upHeadB);
    }

    static int getCount(Node node){
        int count=0;
        for (Node curr = node; curr != null; curr = curr.next) {
            count++;
        }
        return count;
    }
    static Node incrementByGivenStep(Node node, int step){
        for(int i=0;i<step;i++){
            node =node.next;
        }
        return node;
    }

    static Node findIntersect(Node nodeA, Node nodeB){

        while(nodeA!=null && nodeB!=null ){
            if(nodeA == nodeB ){
                return nodeA;
            }
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }

        return null;
    }
}
