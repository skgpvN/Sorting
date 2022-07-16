package Sorting;

public class BubleshortInsertionshortSelectionshort {

    public static void main(String[] args) {
        int arr[] = {7, 3, 1, 8, 2};
        int high = arr.length - 1;
        int x = 55;
//        int j = binarySearchRec(arr, 0, high, x);
//        int f = binarySearchLoop(arr, 0, high, x);
//        System.out.println(j);
//        System.out.println(f);
        bubbleSort(arr);
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

        System.out.println("");
        selection(arr);
        System.out.println("");
        insertion(arr);
    }

    public static int binarySearchRec(int arr[], int low, int high, int x) {

        int mid = low + ((high - low) / 2);
        if (high >= low) {
            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                return binarySearchRec(arr, mid + 1, high, x);
            }
            if (x < arr[mid]) {
                return binarySearchRec(arr, low, mid - 1, x);
            }
        }
//        System.out.println(mid);
        return -1;
    }

    public static int binarySearchLoop(int arr[], int low, int high, int x) {

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                low = mid + 1;
            }
            if (x < arr[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j ];
                    arr[j ] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
