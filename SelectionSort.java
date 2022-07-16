package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static class SelectionShort {
        public static void main(String[] args) {
            int arr[] = {23, 21, 200, -1, 43, 20};
            for (int i = 0; i < (arr.length - 1); i++) {
                int smallest = i;
                for (int j = (i + 1); j < arr.length; j++) {
                    if (arr[smallest]>arr[j]) {
                        smallest = j;
                    }
                }

                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}