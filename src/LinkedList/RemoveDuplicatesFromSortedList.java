package LinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
     Node head=  createLinkedList(Arrays.asList(1,2,2,3,4,5,6,6,6,7,7,8));
     printLinkedList(head);
        Node node = removeDuplicateFromSortedLL(head);
        printLinkedList(node);
    }

    private static Node<Integer> removeDuplicateFromSortedLL(Node<Integer> head) {
        Map<Integer,String> lMap = new HashMap<>();
        Node<Integer> n = new Node(0);
        Node<Integer> temp =n;
        while (head!=null){
            if(!lMap.containsKey(head.data)){
                lMap.put(head.data,"x");
                temp.next=new Node(head.data);
                temp=temp.next;
            }
            head=head.next;
        }
        return n.next;
    }

    private static void printLinkedList(Node head) {
            while (head!=null){
                System.out.print(head.data +"=>");
                head=head.next;
            }
        System.out.println("");
    }

    private static Node createLinkedList(List<Integer> numbers) {
        Node nn = new Node(0);
        Node n =nn;
        for(Integer num :numbers){
            n.next=new Node(num);
            n=n.next;
        }
        return nn.next;
    }
}
