public class mergesort {
    static void printarray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

    static void sorting(int[] arr, int l, int r) {

        if (l >= r)
            return;
        int mid = (l + r) / 2;
        sorting(arr, l, mid);
        sorting(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];

        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2) {
            arr[k++] = right[j++];

        }
    }

    public static void main(String[] args) {
        int arr[] = { 23, 64, 2, 4, 6, 744, 232 };
        int n = arr.length;
        sorting(arr, 0, n - 1);
        System.out.println("Array after sorting");
        printarray(arr);
    }

}
