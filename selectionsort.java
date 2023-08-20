public class selectionsort {
    static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) { // i represent the current index

            // find the minimum element in unsorted part of array
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap current element and minimum element

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 6, 1, 7 };
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
