package LinkedList.Utility;

import LinkedList.Node;

import java.util.List;

public class LLUtility {

    public static Node createLinkedList(List list){
        Node nn = new Node(0);
        Node n =nn;
        for(Object num :list){
            n.next=new Node(num);
            n=n.next;
        }
        return nn.next;
    }

    public static void printLL(Node head){
        while (head!=null){
            System.out.print(head.data +"=>");
            head=head.next;
        }
        System.out.println("");
    }
}
