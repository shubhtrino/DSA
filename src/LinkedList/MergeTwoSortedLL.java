package LinkedList;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLL {

    static Node<Integer >head1=null;
    static Node<Integer >head2=null;


    public static void main(String[] args) {

        MergeTwoSortedLL mergeTwoSortedLL = new MergeTwoSortedLL();
        mergeTwoSortedLL.createLinkedList();
//        mergeTwoSortedLL.traverseLinkedList(head1);
//        mergeTwoSortedLL.traverseLinkedList(head2);

        mergeTwoSortedLL.mergeTwoSortedLL(head1,head2);
    }

    void createLinkedList(){
        List<Integer> list1 = Arrays.asList(1,2,4);
        List<Integer> list2 = Arrays.asList(1,3,4);

        Node<Integer> nodeTemp=head1;
        for(Integer integer:list1){
            Node<Integer> n = new Node<>(integer);
            if(head1==null){
                head1=n;
                nodeTemp=head1;
            }else{
                nodeTemp.next = n;
                nodeTemp = n;
            }

        }

        Node<Integer> nodeTemp2=head2;
        for(Integer integer:list2){
            Node<Integer> n = new Node<>(integer);
            if(head2==null){
                head2=n;
                nodeTemp2=head2;
            }else{
                nodeTemp2.next = n;
                nodeTemp2 = n;
            }

        }
    }

    void traverseLinkedList(Node head){
        while (head!=null){
            System.out.println(head.data);
            head= head.next;
        }
    }

    void mergeTwoSortedLL(Node<Integer> head1,Node<Integer> head2){

        Node tempNode = new Node(0);
        Node currentNode =tempNode;

        while(head1 !=null && head2 !=null){
                if(head1.data < head2.data){
                    currentNode.next=head1;
                    head1=head1.next;
                }else{
                    currentNode.next=head2;
                    head2=head2.next;
                }
            currentNode=currentNode.next;
        }

        if(head2 == null){
            currentNode.next=head1;
        }
        if(head1 == null){
            currentNode.next=head2;
        }

       traverseLinkedList(tempNode.next);
    }

}
