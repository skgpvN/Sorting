package Sorting;

public class AscendingDescendingPattern {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 5, 6, 7, 9, 67, 8, 99, 789, 890,654, -4, -6, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


        }
        System.out.println();
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i <= end; i++) {
            int mid = (end + start) / 2;
            if (i <= mid) {
                System.out.print(arr[i] + " ");
            }
            if (i > mid) {
                for (int j = end; j > mid; j--) {
                    System.out.print(arr[j] + " ");


                }
                break;

            }


        }

    }
}
