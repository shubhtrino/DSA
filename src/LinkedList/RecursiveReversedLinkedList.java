package LinkedList;

public class RecursiveReversedLinkedList {

    public static void main(String[] args) {

        LinkedListCRUD linkedListCRUD = new LinkedListCRUD();
        linkedListCRUD.createLinkedList();

        RecursiveReversedLinkedList reversedLinkedList= new RecursiveReversedLinkedList();
        System.out.println("##Before reverse");
        linkedListCRUD.traverseLinkedList(LinkedListCRUD.head);
        System.out.println("##After reverse");
        Node result = reversedLinkedList.recursiveReversedLinkList(LinkedListCRUD.head);
        linkedListCRUD.traverseLinkedList(result);


    }


    Node recursiveReversedLinkList(Node head){

        if(head==null || head.next ==null){
            return head;
        }
        Node newHead = recursiveReversedLinkList(head.next);
        Node headNext =head.next;
        headNext.next = head;
        head.next=null;

        return newHead ;
    }
}
