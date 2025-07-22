package QUEUES;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
//display of queue elements

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(4);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        //System.out.println(q);
        Queue<Integer> helper =new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        while(helper.size()>0){
            q.add(helper.remove());
        }

    }
}
