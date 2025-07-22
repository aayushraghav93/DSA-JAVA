package linkedlist.java;

public class circularlinkedlist {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static void display(Node head){
        System.out.print(head.val+" ");
        Node temp=head.next;
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }


    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(13);
        Node c=new Node(99);
        Node d=new Node(25);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=a;
        display(a);

    }
}
