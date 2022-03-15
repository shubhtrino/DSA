package LinkedList;

import LinkedList.Utility.LLUtility;

import java.util.Arrays;

public class MiddleOFLL {
    public static void main(String[] args) {
        Node headNode = LLUtility.createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        Node tempNode =headNode;
        LLUtility.printLL(tempNode);

        Node middleOfLL = findMiddleOfLL(headNode);
        LLUtility.printLL(middleOfLL);
    }

    private static Node findMiddleOfLL(Node headNode) {

        Node sNode= headNode;
        Node fNode= headNode;

        while (fNode!=null && fNode.next!=null){
            fNode = fNode.next.next;
            sNode = sNode.next;
        }
        return  sNode;
    }
}
