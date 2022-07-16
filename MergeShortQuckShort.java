package Sorting;

import java.util.Arrays;

public class MergeShortQuckShort {
    public static void main(String[] args) {
        // write your code here
        int arr[] = {5, 1, 1, 96, 6};
        quicksort(arr, 0, arr.length - 1);
        printarray(arr);
        mergesort(arr, 0, arr.length - 1);
        printarray(arr);
    }

    private static void printarray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }

    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merger(arr, low, mid, high);
        }
    }

    public static void merger(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            rightarr[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (leftarr[i] < rightarr[j]) {
                arr[k++] = leftarr[i++];
            } else {
                arr[k++] = rightarr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftarr[i++];
        }
        while (j < n2) {
            arr[k++] = rightarr[j++];
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
