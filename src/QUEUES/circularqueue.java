package QUEUES;

public class circularqueue {
    public static class Cqueue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[5];

        public void add (int val) throws Exception{
            if(size==arr.length){
               throw new Exception("Queue is full");
            } else if (size==0) {
                f=r=0;
                arr[0]=val;
            }  else if(r<arr.length-1) {
                arr[++r]=val;

            }
            else if (r==arr.length-1) {
                r=0;
                arr[0]=val;

            }
           size++;
        }

        public  int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            } else {
                int val=arr[f];
                if (f == arr.length - 1)
                    f=0;
                else f++;
                size--;
                return val;
            }

        }


        public int peek() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }
            else return arr[f];
        }

        public void  display(){
            if(size==0){
                System.out.print("queue is empty");
            } else if (f<=r) {
                for(int i=f;i<=r;i++)
                    System.out.print(arr[i]+" ");

            }
            else {
                for(int i=f;i<arr.length-1;i++){
                    System.out.print(arr[i]+" ");}
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");}
            }
            System.out.println();

        }

    }

    public static void main(String[] args) throws Exception {
        Cqueue q=new Cqueue();
        q.display();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.display();
q.remove();
q.display();
q.add(5);
q.display();
q.add(6);
q.display();
    }

}
