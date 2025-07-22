package STACKS;

import java.util.Scanner;
import java.util.Stack;

public class balancebrackets {
    public static boolean isbalanced(String str){
        int n=str.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='(') st.push(ch);
            else {
                if(st.size()==0)
                    return false;
                if(ch==')')
                    st.pop();
            }
        }
        if(st.size()>0) return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
                String a=sc.nextLine();
        System.out.println(isbalanced(a));
    }
}
