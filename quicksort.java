public class quicksort {
    static void printarray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                cnt++;

        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return pivotIdx;

    }

    static void swap(int[] arr, int st, int pivotIdx) {
    }

    static void sorting(int arr[], int st, int end) {
        if (st >= end)
            return;
        int pi = partition(arr, st, end);
        sorting(arr, st, pi - 1);
        sorting(arr, pi + 1, end);

    }

    public static void main(String[] args) {
        int arr[] = { 23, 64, 2, 4, 6, 744, 232 };
        int n = arr.length;
        sorting(arr, 0, n - 1);
        System.out.println("Array after sorting");
        printarray(arr);
    }
}
