package STACKS;

public class linkedlistimplimentation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        boolean underflow(){
            if(head==null)
                return true;
            return false;
        }

        int pop(){
            if(underflow()){
                System.out.println("stsck is empty");
                return -1;
            }
            int top=head.val;
            head=head.next;
            return top;

        }

       int peek(){
            return head.val;

        }

        int size(){
            return size;
        }

        void displayrev(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayrec(Node h){
            if(h==null)
                return;

            displayrec(h.next);
            System.out.print(h.val+" ");

        }

        void display(){
            displayrec(head);
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.display();

        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
