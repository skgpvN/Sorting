package Sorting;

public class ReplaceDublicate {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 4, 5, 5, 6, 7};
//        int n = arr.length;
//        int arr2[] = new int[n];
//        int j = 0;
//
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                arr2[j] = arr[i];
//                j++;
//
//            }
//        }
//        arr2[j++]=arr[n-1];
//        for(int i=0; i<j;i++){
//            System.out.print(arr2[i]+" ");
//        }
        int arr[] = {1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6};
        int n = arr.length;
        int arr1[] = new int[n];
        int x = 5;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i+1]) {
                arr1[j] = arr[i];
                j++;
            }
        }
        arr1[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
