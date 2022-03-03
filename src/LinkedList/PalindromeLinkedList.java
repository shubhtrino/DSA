package LinkedList;

public class PalindromeLinkedList {

     Node<String> head =null;

    public static void main(String[] args) {


        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        palindromeLinkedList.createLinkedList();

      /*  Logic: 1.Find Middle Node in linkedlist
               2.Reverse linkedlist from middle to end
               3.compare from 2 pointers*/

        Node mid =palindromeLinkedList.getMiddleNode(palindromeLinkedList.head);
        System.out.println(mid.data);
        Node revNode =palindromeLinkedList.reverseLinkedList(mid);
        System.out.println(revNode.data);
        System.out.println(palindromeLinkedList.checkPalindrome(palindromeLinkedList.head,revNode));
    }

    boolean checkPalindrome(Node startHead, Node endHead){
        while ( endHead!=null){
                if(startHead.data !=endHead.data)
                    return false;
                    startHead=startHead.next;
                    endHead=endHead.next;
        }
        return true;
    }

    Node getMiddleNode(Node head){

        Node slow =head;
        Node fast =head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

        //Not so good logic
       /* int i=0;
        Node mid = head;
        while (head.next!=null){
            head=head.next;
            i++;
            if(i%2==0){
                mid=mid.next;
            }
        }
       return mid;*/
    }

    Node reverseLinkedList(Node head){

        Node cur= head;
        Node prev= null;

        while(cur!=null){
            Node temp =cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

    void createLinkedList(){
         head=null;
        Node<String> n1 = new Node<>("A");
        Node<String> n2 = new Node<>("n");
        Node<String> n3 = new Node<>("N");
        Node<String> n4 = new Node<>("A");

        head=n1;
        head.next = n2;
        n2.next = n3;
        n3.next=n4;
        n4.next=null;

    }
}
