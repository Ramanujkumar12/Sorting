/**
 * Bubblesort
 */
public class Bubblesort {
    static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 365, 370, 43, 4, 23, 444 };
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}