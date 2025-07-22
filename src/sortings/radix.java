package sortings;

import static sortings.mergesorting.displayarr;
import static sortings.basiccountsort.maincountsort;

public class radix {
    public static int findmax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max)
                max=a;
        }
        return max;
    }
    public static void maincountsort(int[] arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int max=findmax(arr);
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        //makinf prefix sum arrya of count array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];

        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }


        //make all elements copy from output to main arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }


    }
    public static void radixsort(int[] arr){
        int max=findmax(arr);
        for(int place=1;max/place>0;place*=10)
            maincountsort(arr,place);
    }

    public static void main(String[] args) {
        int[] arr={5,7,1,3,8,9,3,4};
        System.out.println("array before sort");
        displayarr(arr);
        radixsort(arr);
        System.out.println();
        System.out.println("array after sorting");
        displayarr(arr);
    }
}
