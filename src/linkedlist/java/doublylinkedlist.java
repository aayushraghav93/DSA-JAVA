package linkedlist.java;

public class doublylinkedlist {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void revdisplay(Node tail){
        Node temp=tail;
        while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.prev;}
        System.out.println();
    }
    //when a random node is given from in between then display function will be
    public static void displayfromrandom(Node random){
        Node temp=random;
        //moving the temp to head of list
        while(temp.prev!=null){
            temp=temp.prev;
        }
        //now temp is at head
        //print the list from starting
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertathead(Node head,int val){
        Node temp=new Node(val);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }

    public static void insertattail(Node head,int val){//last me insert k liye
        Node temp=head;
       //temp ko last tak lekr jaate hain
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(val);
        temp.next=t;
        t.prev=temp;
    }

    public static void insertatidx(Node head,int idx,int val){
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        //now temp ek pehle index par hai
        Node t=new Node(val);//new node create hua
        temp.next.prev=t;//temp k agle ke prev me new node ka address
        t.prev=temp;//nye nide ke prev me temp ka address
        t.next=temp.next;//nye ke next me temp ke agle ka address
        temp.next=t;//temp me naye ka address

    }


    //PROGRAMS FOR DELETION
    public static Node deletefromhead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }

    public static Node deletefromend(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }

        temp=temp.prev;
        temp.next=null;
        return head;
    }

    public static Node deleteatidx(Node head,int idx){
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        if(temp.next.next==null)
            temp.next=null;
        else{
        temp.next=temp.next.next;
        temp.next.next.prev=temp;}
        return head;
    }

    public static void main(String[] args) {
        //4 10 2 99 13
        Node a =new Node(4);
        Node b =new Node(10);
        Node c =new Node(2);
        Node d =new Node(99);
        Node e =new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        //revdisplay(e);
        //displayfromrandom(e);
        //Node newhead=insertathead(a,30);
       // display(newhead);
        //Node newtail=insertattail(e,30);
         //insertattail(a,30);
        // display(a);
//insertatidx(a,2,50);
        Node newhead=deleteatidx(a,4);
        display(newhead);


    }
}
