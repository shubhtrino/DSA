package LinkedList;

public class DuplicateLinkedListWithRandomPointer {

    static Node head=null;
    public static void main(String[] args) {

        DuplicateLinkedListWithRandomPointer dllwrp= new DuplicateLinkedListWithRandomPointer();

        dllwrp.createLinkedList();
        dllwrp.traverseLinkedList(head);
        Node mainHead = dllwrp.addNodeInBetween(head);
        dllwrp.traverseLinkedList(head);
        dllwrp.adjustRandomPointer(mainHead);
        dllwrp.traverseLinkedList(head);
        Node copyHead = dllwrp.reAdjustLinkedList(mainHead);

        dllwrp.traverseLinkedList(mainHead);
        dllwrp.traverseLinkedList(copyHead);


    }

    public void traverseLinkedList(Node head) {
        Node current =head;
            while (current!=null ){
                System.out.print(current.data+":"+ (current.random==null ? "-" : current.random.data) +" ");
                current=current.next;
            }
        System.out.println();
    }

    public  void createLinkedList() {

        Node<Integer> n1= new Node<>(10);
        Node<Integer> n2= new Node<>(20);
        Node<Integer> n3= new Node<>(30);
        Node<Integer> n4= new Node<>(40);
        head =n1;
        n1.next=n2;
        n1.random=n3;

        n2.next=n3;
        n2.random=n4;

        n3.next=n4;
        n3.random=n3;

        n4.next=null;
        n4.random=n3;

    }

    public static class Node<T>{
        T data;
        Node next;
        Node random;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node addNodeInBetween(Node head){

        Node current=head;
        while (current!=null ){
            Node temp= current.next;
            current.next =new Node(current.data);
            current.next.next=temp;
            current=temp;
        }
        return head;
    }

    public void adjustRandomPointer(Node current){
        while (current!=null){
            if(current.next!=null){
                current.next.random=(current.random!=null) ? current.random.next : null;
            }
            current=current.next.next;
        }
    }

    public  Node reAdjustLinkedList(Node original){
        Node current=original;
        Node copy = original.next;
        Node temp=copy;

        while (current!=null){
            current.next=current.next.next;
            copy.next=(copy.next!=null)?copy.next.next:null;

            current=current.next;
            copy=copy.next;
        }

        return temp;
    }
}
