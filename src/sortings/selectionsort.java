package sortings;

public class selectionsort {


    public  static  void ssort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }

            }
            //swap minindex and i
            if(minindex!=i)
            {
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,8,2,9,5,4};
        ssort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
