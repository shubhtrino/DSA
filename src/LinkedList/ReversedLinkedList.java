package LinkedList;

public class ReversedLinkedList {

    public static void main(String[] args) {

        LinkedListCRUD linkedListCRUD = new LinkedListCRUD();
        linkedListCRUD.createLinkedList();

        ReversedLinkedList reversedLinkedList = new ReversedLinkedList();
        System.out.println("##Before Reverse");
        linkedListCRUD.traverseLinkedList(LinkedListCRUD.head);
        reversedLinkedList.reverse(LinkedListCRUD.head);
        System.out.println("##After reverse");
        linkedListCRUD.traverseLinkedList(LinkedListCRUD.head);

    }

    public void reverse(Node head) {
       Node cur=head;
       Node prev=null;
       while (cur!=null){
           Node temp =cur.next;
           cur.next=prev;
           prev=cur;
           cur=temp;
       }
        LinkedListCRUD.head =prev;
    }

}
