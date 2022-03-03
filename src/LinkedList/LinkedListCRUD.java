package LinkedList;

public class LinkedListCRUD {

    static Node<Integer> head = null;

    public static void main(String[] args) {

        LinkedListCRUD linkedListCRUD = new LinkedListCRUD();
        System.out.println("### Creating List");
        linkedListCRUD.createLinkedList();
        linkedListCRUD.traverseLinkedList(head);
        System.out.println("### Inserting List");
        linkedListCRUD.insertIntoLinkedList(25,head,3);
        linkedListCRUD.traverseLinkedList(head);
        System.out.println("#### deletion from node");
        linkedListCRUD.deleteFromLinkedList(head,3);
        linkedListCRUD.traverseLinkedList(head);
    }

    void createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(15);
        Node<Integer> n3 = new Node<>(20);
        Node<Integer> n4 = new Node<>(30);
        Node<Integer> n5 = new Node<>(40);

        head=n1;
        head.next = n2;
        n2.next = n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;

    }

    void traverseLinkedList(Node current){
        while(current!=null){
            System.out.print(current.data +" ");
            current =current.next;
        }
        System.out.println();
    }

    void  insertIntoLinkedList(int data,Node head,int position){

        Node<Integer> toAdd = new Node<>(data);
        if(position==0){
            toAdd.next=head;
            head=toAdd;
        }

       Node prev=head;
       for(int i=0;i<position-1;i++){
           prev=prev.next;
       }

       toAdd.next=prev.next;
       prev.next=toAdd;

    }

    void deleteFromLinkedList(Node head,int position){

        if(position==0){
            head=head.next;
        }

        Node prev=head;
        for(int i=0;i<position-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;


    }
}



