package LinkedList;

import LinkedList.Utility.LLUtility;

import java.util.Arrays;

public class SortLL {

    public static void main(String[] args) {
        Node headNode = LLUtility.createLinkedList(Arrays.asList(2,3,1));
        LLUtility.printLL(headNode);

        SortLL sortLL = new SortLL();
        Node node = sortLL.sortLinkedList(headNode);
        LLUtility.printLL(node);

    }

    Node sortLinkedList(Node head){
        //3, 2,0, 6, 1,4,7
        if(head==null || head.next ==null){
            return head;
        }
        Node p1=head;

        Node middleNode = getMiddleNode(head);
        Node p2 = middleNode.next;
        middleNode.next =null;

        p1 = sortLinkedList(p1);
        p2 = sortLinkedList(p2);

       return mergeSortList(p1,p2);

    }

    Node mergeSortList(Node n1, Node n2){

        Node head = new Node(0);
        Node cHead = head;
         int n1Data = (int) n1.data;
         int n2Data = (int) n2.data;

         while(n1!=null && n2!=null){
             if(n1Data < n2Data){
                 cHead.next =n1;
                 n1=n1.next;
             }else {
                 cHead.next=n2;
                 n2=n2.next;
             }
             cHead=cHead.next;
         }


        if(n1 == null){
            cHead.next=n2;
        }
        if(n2 == null){
            cHead.next=n1;
        }
        return head.next;
    }

    Node getMiddleNode(Node head){
        if(head ==null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        if(fast.next == null || fast.next.next == null){
            return slow;
        }
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
