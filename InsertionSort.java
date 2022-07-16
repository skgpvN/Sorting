package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1, 5, -3, -4, 7};
        for (int i = 1; i < arr.length - 1; i++) {
            int current = arr[i];
            int j = i - 1;
                while (j >= 0 && current <arr[j]) {
                    arr[j+1]=arr[j];
                    j--;
                }
            arr[j+1]=current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
