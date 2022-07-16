package Sorting;

public class BubleShort {

    public static void main(String[] args) {
        //bubble short//
        int arr[] = {7, 3, 2, 1, 8};
        int i;
        for ( i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] =temp;
                }
            }
        }
        for(i=0; i<arr.length;i++){
            System.out.print((arr[i])+" ");

        }
        //binary search//
        System.out.println();
        int start=0;
        int end=arr.length-1;
        int x=3;
        for(i=0;i<arr.length;i++){
            while(start<=end){
                int mid=start+((end-start)/2);
                if(arr[mid]>x){
                    end=mid-1;
                }
                if (arr[mid]<x){
                    start=mid+1;
                }
                if (arr[mid]==x){
                    System.out.println(mid);
                    return;
                }
            }
        }
    }
}
