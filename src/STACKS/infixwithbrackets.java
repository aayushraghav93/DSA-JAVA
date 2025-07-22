package STACKS;

import java.util.Stack;

public class infixwithbrackets {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        Stack<Integer> st=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){//harcharacter pe traverse karke use accordingly push krna h
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                st.push(ascii-48);
            }
            else if(op.size()==0||ch=='('||op.peek()=='(')op.push(ch);
            else if(ch==')') {//agar ch closing bracket aaya to jab tak kaam karte jaao jab tak open bracket na aajaye
                while (op.peek() != '(') {
                    //work
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '+') st.push(v1 + v2);
                    if (op.peek() == '-') st.push(v1 - v2);
                    if (op.peek() == '*') st.push(v1 * v2);
                    if (op.peek() == '/') st.push(v1 / v2);
                    op.pop();
                }
                op.pop();//open bracvket ko hta diyaa
            }
            else {
                if (ch == '+' || ch == '-') {
                    //work
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '+') st.push(v1 + v2);
                    if (op.peek() == '-') st.push(v1 - v2);
                    if (op.peek() == '*') st.push(v1 * v2);
                    if (op.peek() == '/') st.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        //work
                        int v2 = st.pop();
                        int v1 = st.pop();
                        if (op.peek() == '*') st.push(v1 * v2);
                        if (op.peek() == '/') st.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);

                }
            }
        }

        while(st.size()>1){
            //work
            int v2 = st.pop();
            int v1 = st.pop();
            if (op.peek() == '+') st.push(v1 + v2);
            if (op.peek() == '-') st.push(v1 - v2);
            if (op.peek() == '*') st.push(v1 * v2);
            if (op.peek() == '/') st.push(v1 / v2);
            op.pop();

        }
        System.out.println(st.peek());
    }
}

