package linkedlist.java;

public class reverselist {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        if(head==null)
            return;
        System.out.print(head.val+" ");
        display(head.next);
        //System.out.println();

    }
    public static void reversedisplay(Node head){
        if(head==null)
            return;

        reversedisplay(head.next);
        System.out.print(head.val+" ");

    }

    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(6);
        Node d=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
        System.out.println();
        reversedisplay(a);

    }
}
