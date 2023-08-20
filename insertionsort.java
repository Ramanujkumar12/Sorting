public class insertionsort {
   static void sorting(int[] arr) {
      int n = arr.length;
      for (int i = 1; i < n; i++) {
         int j = i;
         while (j < 0 && arr[j] < arr[j - 1]) {
            // swap arr[j], arr[j-1]
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
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
