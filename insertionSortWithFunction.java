package Sorting;

public class insertionSortWithFunction {
    public static void main(String[] args) {
        int arr[] = {1, -3, 4, 5, 7, 3, 1};
        for (int i = 1; i < arr.length - 1; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && element < arr[i]) {
                arr[j + 1] = arr[j];
                j--;
            }


        }

    }
}
