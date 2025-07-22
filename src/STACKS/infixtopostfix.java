package STACKS;
//idme sabkuch same rhega prefix ki trh bss e=wrk me jo string ham
//push kar he uska postfix exp ki form mr pudh krnge
import java.util.Stack;

public class infixtopostfix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(str);
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {//harcharacter pe traverse karke use accordingly push krna h
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {//yahan ham check kar rhe ki vo 0 to9 ke beech lie kr rha
                st.push(ch + "");
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')') {//agar ch closing bracket aaya to jab tak kaam karte jaao jab tak open bracket na aajaye
                while (op.peek() != '(') {
                    //work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    st.push(t);
                }
                op.pop();//open bracvket ko hta diyaa
            } else {
                if (ch == '+' || ch == '-') {
                    //work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    st.push(t);
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        st.push(t);
                        op.push(ch);
                    } else op.push(ch);

                }
            }
        }

        while (st.size() > 1) {
            //work
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String t = v1 + v2 + o;
            st.push(t);


        }
        String postfix = st.pop();
        System.out.println(postfix);
    }
}
