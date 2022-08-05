import java.util.Arrays;

public class Main {

  public static void mergeSort(int[] arr, int n) {
    // TODO: insert you logic here...
  }
  // don't forget about merge().

  public static void main(String[] args) {
    // Here is an example array.
    // You can alter this however you want.
    int[] arr = { 4, 1, 7, 2, 6, 4, 62, 5 };
    int n = arr.length;
    // Here is the main Merge Sort method,
    // please insert the approprate parmeters into this
    // method.
    mergeSort(arr, n);

    // Your sorted array should print here:
    System.out.println(Arrays.toString(arr));
  }
}
