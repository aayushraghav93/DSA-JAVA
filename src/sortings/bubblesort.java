package sortings;

public class bubblesort {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //if any swap happened for this a flag variable
            boolean flag =false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(flag==false){
                return;
            }

        }
    }


    public static void main(String[] args) {
        int[] a={2,3,1,7,3,6,2};
        bubblesort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
