package Sorting;

import java.util.Arrays;

public class SelectionSortUsingFunction {
    public static void SelectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n+1; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;

                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 3, 4, 1, -1};
        int n = arr.length - 1;
        SelectionSort(arr, n);
        System.out.println(Arrays.toString(arr));

    }
}
