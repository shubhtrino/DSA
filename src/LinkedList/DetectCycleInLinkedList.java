package LinkedList;

public class DetectCycleInLinkedList {

    static Node head =null;

    public static void main(String[] args) {

        DetectCycleInLinkedList dcl = new DetectCycleInLinkedList();
        dcl.createLinkedList();
        //dcl.traverseLL(head);
        Node cycleFoundNode =dcl.checkCyclicDependency(head);
        Node start = dcl.checkFirstNodeToCauseCycle(head,cycleFoundNode);

        System.out.println(start.data);
    }

    private Node checkFirstNodeToCauseCycle(Node startNode,Node endNode) {
        Node start =  startNode;
        while (start!=endNode){
            start=start.next;
            endNode=endNode.next;
        }
        return start;
    }

    private Node checkCyclicDependency(Node head) {
        Node slowNode=head;
        Node fastNode=head;

        while (fastNode!=null && fastNode.next!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
            if(slowNode==fastNode)
                return slowNode;
        }
     return null;
    }

    private void createLinkedList() {

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        Node<Integer> n6 = new Node<>(60);
        Node<Integer> n7 = new Node<>(70);

        head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n3;
    }

    void traverseLL(Node current){
        while (current!=null){
            System.out.print(current.data +" ");
            current=current.next;
        }
        System.out.println();
    }

}
