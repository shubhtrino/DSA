package LinkedList;

import LinkedList.Utility.LLUtility;

import java.util.Arrays;

/* Java program to delete node from LL when head node is not given*/
public class DeleteNodeInLL {

    public static void main(String[] args) {
        Node<Integer> head = LLUtility.createLinkedList(Arrays.asList(2, 3, 7, 9, 0, 1));
        LLUtility.printLL(head);
        deleteNodeFromLL(head.next.next); //assuming passing 7
        LLUtility.printLL(head);
    }

    private static void deleteNodeFromLL(Node nodeToDelete) {
            nodeToDelete.data = nodeToDelete.next.data;
            nodeToDelete.next=nodeToDelete.next.next;
    }
}
