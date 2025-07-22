package STACKS;

import java.util.Scanner;
import java.util.Stack;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
