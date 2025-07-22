package HashMap;

import java.util.LinkedList;

public class hashmapimplimentation {

    static class  myhashmap<K,V>{
        public static final int Defaultcapacity=4;
        public static final float Defaultloadfactor=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;
        private void initbuckets(int N){
            buckets =new LinkedList[N];
            for (int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int hashfunc(K key){
            int hc=key.hashCode();
            return  (Math.abs(hc))%buckets.length;

        }
        private int searchinbucket(LinkedList<Node> ll,K key){
            for (int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        public void myhashmap(){
            initbuckets(Defaultcapacity);

        }
        private void  rehash(){
            LinkedList<Node>[] oldbuckets=buckets;
            initbuckets(oldbuckets.length*2);
            n=0;
            for (var bucket :oldbuckets){
                for (var node :bucket){
                  put(node.key, node.value);
                }

            }


        }

        public int size(){
            return n;

        }


        public void put(K key,V value){
            int bi=hashfunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei=searchinbucket(currbucket,key);
            if (ei==-1){
                Node node =new Node(key,value);
                currbucket.add(node);
                n++;
            }
            else {
                Node currnode=currbucket.get(ei);
                currnode.value=value;
            }

            if (n>=buckets.length*Defaultloadfactor){
                rehash();
            }


        }

        public V get(K key){
            int bi= hashfunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei=searchinbucket(currbucket,key);
            if (ei!=-1){
                Node currnode=currbucket.get(ei);
                return  currnode.value;
            }
            return null;

        }
        public V remove(K key){
            int bi=hashfunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei=searchinbucket(currbucket,key);
            if (ei!=-1){
                Node currnode=currbucket.get(ei);
                V val=currnode.value;
                currbucket.remove(ei);
                n--;
                return val;

            }
            return null;


        }

    }



    public static void main(String[] args) {
myhashmap<String,Integer> mp=new myhashmap<>();
        System.out.println("test");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        System.out.println(mp.size());
        mp.put("c",30);
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));

    }
}
