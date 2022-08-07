package Sorting;

public class SumOfSubarrayElement {
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 4, 9, 6, 3, 6};
        int n = arr.length;
        int sum = 18;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum = arr[i];
            for (int j = i + 1; j <= n; j++) {
                if (currentSum == sum) {
                    int N = j - 1;
                    System.out.println(i + " " + N);
                    return;
                }
                if (currentSum > sum || j == arr.length) {
                    break;
                }
                currentSum = currentSum + arr[j];

            }


        }
        if (currentSum != sum) {
            System.out.println("Not found");
        }

    }

}
