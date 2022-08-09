package Sorting;

import java.util.Arrays;

public class MergeSort1 {
    public static void conquer(int arr[], int startI, int mid, int endI) {
        int merged[] = new int[endI - startI + 1];
        int index1 = startI;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= endI) {
            if (arr[index1] < arr[index2]) {
                merged[x] = arr[index1];
                x++;
                index1++;
            } else {
                merged[x] = arr[index2];
                x++;
                index2++;
            }
        }
        while (index1 <= mid) {

            merged[x++] = arr[index1++];

        }
        while (index2 <= endI) {
            merged[x++] = arr[index2++];

        }
        for (int i = 0, j = startI; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int startI, int endI) {
        if (startI >= endI) {
            return;
        }
        int mid = startI + (endI - startI) / 2;
        divide(arr, startI, mid);
        divide(arr, mid + 1, endI);
        conquer(arr, startI, mid, endI);

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 25, 6, 54, 7};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
