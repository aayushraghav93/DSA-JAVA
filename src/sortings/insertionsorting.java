package sortings;

public class insertionsorting {

    public static void insertionsort(int[] arr){
       int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,6,9,2,1,5};
        insertionsort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
