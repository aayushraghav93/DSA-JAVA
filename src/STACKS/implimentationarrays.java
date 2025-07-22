package STACKS;



public class implimentationarrays {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=-1;


        void push(int x){
            if(overflow()){
                System.out.println("stack is full");
                return;
            }
            idx=idx+1;
            arr[idx]=x;
        }

        int peek() {
            if (idx == -1) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx];
        }

        boolean underflow(){
            if(idx==-1){
                return true;
            }
            return false;
        }

        boolean overflow(){
            if(idx==4) {
                return true;
            }
            return false;
        }
        int pop(){
            if(underflow()){
                System.out.println("stack is empty");
                return -1;
            }
         int top=arr[idx];
           idx--;
           return top;

        }


        void display(){
            for(int i=0;i<=idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int  size(){
            return idx+1;
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
