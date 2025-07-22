package STACKS;

import java.util.Stack;

public class display {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       System.out.println(st);


       //to display the stack using another stack
//        Stack<Integer> rt =new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            System.out.print(rt.peek()+" ");
//
//            st.push(rt.pop());
//        }
//        System.out.println();
//        System.out.println(st);




        //to display using array
        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){//array me stack ke elemnets bharna
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
