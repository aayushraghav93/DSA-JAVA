package linkedlist.java;

public class implimentation {
    public static class Node{
        int data;
        Node next;
        Node(int data ){
            this.data=data;

        }
    }
    public static class linkedlist{
        Node head;
        Node tail;
        void insertatend(int data)
        {
            Node temp = new Node(data);
            if (head == null) {
                tail.next = temp;
                tail = temp;
                head = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

        }
        void display(){
            if(head==null)
                System.out.println("empty");
            else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }}
        }
        void insertathead(int data){
            Node temp=new Node(data);
            if(head==null)
                head=tail=temp;
            else{
            temp.next=head;
            head=temp;
        }}
        void deleteatend(){
            if(head==null){
                System.out.println("empty list");
                return;
            }
            else{
                Node temp=head;
                Node temp1=head;
                while(temp.next!=null){
                    temp1=temp;
                    temp=temp.next;

                }
                temp1.next=null;
                tail=temp1;
            }
        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertathead(5);
        ll.insertathead(10);
        ll.insertatend(4);
        ll.deleteatend();
        System.out.println(ll.tail.data);
        ll.display();
    }
}
