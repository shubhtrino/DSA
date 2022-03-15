package LinkedList;

import LinkedList.Utility.LLUtility;

import java.util.*;

public class FindNthNodeFromLastInLL {



    public static void main(String[] args) {

        
        Node headNode = LLUtility.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Node tempHead= headNode;
        LLUtility.printLL(headNode);

        //2: find 1st node from last
        Node nthNodeFromLL = findNthNodeFromLL(tempHead, 2);
        System.out.println(nthNodeFromLL.data);

    }

    private static Node findNthNodeFromLL(Node headNode, int i) {

        Node slowNode =headNode;
        Node fastNode= headNode;

        int start=1;
        // Logic is to create a distance of (n-1) node first
        // once achieved move both node one by one
        // as distance is of nth node so when fast one will reach to null
        // it means slower once is behind by nth node

        while (fastNode.next!=null){
            fastNode=fastNode.next;
            start++;
            if(start>i){
                slowNode=slowNode.next;
            }
        }

        return slowNode;
    }
}
