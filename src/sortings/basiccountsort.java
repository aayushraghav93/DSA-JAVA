package sortings;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import static sortings.mergesorting.displayarr;

public class basiccountsort {
    public static int findmax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max)
                max=a;
        }
        return max;
    }


    /*public static void basiccountsorting(int[] arr){
        int max =findmax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }

        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }*/

    public static void maincountsort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findmax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //makinf prefix sum arrya of count array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];

        }
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }


        //make all elements copy from output to main arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }


    }


    public static void main(String[] args) {
        int[] arr={5,7,1,3,8,9,3,4};
        System.out.println("array before sort");
        displayarr(arr);
        maincountsort(arr);
        System.out.println();
        System.out.println("array after sorting");
        displayarr(arr);
    }
}
