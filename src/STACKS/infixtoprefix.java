package STACKS;

import java.util.Stack;

//iss case me conditions to saari same rhengi infix ke jaise
//bss hoga kya ki work me changhe aajyga
//isme work krte time evaluetion nhi krngr balki string add krte jayenge in the form of prefix exp
//so stack bhi string type ka bnega
public class infixtoprefix {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        System.out.println(str);
        Stack<String> st=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){//harcharacter pe traverse karke use accordingly push krna h
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){//yahan ham check kar rhe ki vo 0 to9 ke beech lie kr rha
                st.push(ch+"");
            }
            else if(op.size()==0||ch=='('||op.peek()=='(')op.push(ch);
            else if(ch==')') {//agar ch closing bracket aaya to jab tak kaam karte jaao jab tak open bracket na aajaye
                while (op.peek() != '(') {
                    //work
                    String v2 = st.pop();
                   String v1 = st.pop();
                   char o=op.pop();
                   String t=o+v1+v2;
                   st.push(t);
                }
                op.pop();//open bracvket ko hta diyaa
            }
            else {
                if (ch == '+' || ch == '-') {
                    //work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o=op.pop();
                    String t=o+v1+v2;
                    st.push(t);
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        //work
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o=op.pop();
                        String t=o+v1+v2;
                        st.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);

                }
            }
        }

        while(st.size()>1){
            //work
            String v2 = st.pop();
            String v1 = st.pop();
            char o=op.pop();
            String t=o+v1+v2;
            st.push(t);


        }
        String prefix=st.pop();
        System.out.println(prefix);

    }
}
