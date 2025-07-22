package sortings;

public class quick {
    public static void displayarr(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[] arr, int st,int end){
        int pivot=arr[st];
        int ct=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot) ct++;
        }

       int pivotindex=st+ct;
        swap(arr,st,pivotindex);
        int i=st,j=end;
        while(i<pivotindex&&j>pivotindex){
            while(arr[i]<=arr[pivotindex]) i++;
            while(arr[j]>arr[pivotindex]) j--;
            if(i<pivotindex&&j>pivotindex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotindex;
    }

    public static void quicksort(int[] arr,int st,int end){
        if(st>=end) return;
        int pi=partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);


    }

    public static void main(String[] args) {
        int[] arr={5,4,8,2,6,1,5};
       int n=arr.length;

        System.out.println("array before sorting");
        displayarr(arr);
        System.out.println();
        quicksort(arr,0,n-1);
        System.out.println("array after sorting");
        displayarr(arr);
    }
}
