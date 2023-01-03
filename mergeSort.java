import java.util.Arrays;

/* 
--Time Complexity : Worst case = Best Case = O(n log n)
    
--Space Complexity : O(n), since auxiliary array of size at most n is used to store the merged subarray
*/ 

public class mergeSort {

  public static void sort(int[] array) {
    if (array.length > 1) {
      // Reduce the array by half
      int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
      int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

      // Sort each half
      sort(left);
      sort(right);

      // Reconcile the separated portions.
      merge(array, left, right);
    }
  }

  public static void merge(int[] array, int[] left, int[] right) {
    int leftIndex = 0;
    int rightIndex = 0;
    int arrayIndex = 0;

    // Compare elements at leftIndex and rightIndex and
    // move the smaller element at arrayIndex
    while (leftIndex < left.length && rightIndex < right.length) {
      if (left[leftIndex] < right[rightIndex]) {
        array[arrayIndex] = left[leftIndex];
        leftIndex++;
      } else {
        array[arrayIndex] = right[rightIndex];
        rightIndex++;
      }
      arrayIndex++;
    }

    // Copy the remaining elements from the left array
    while (leftIndex < left.length) {
      array[arrayIndex] = left[leftIndex];
      leftIndex++;
      arrayIndex++;
    }

    // Copy the remaining elements from the right array
    while (rightIndex < right.length) {
      array[arrayIndex] = right[rightIndex];
      rightIndex++;
      arrayIndex++;
    }
  }

  public static void main(String[] args) {
    int[] array = {4, 10, 3, 5, 1, 8};

    sort(array);

    System.out.println(Arrays.toString(array));
  }
}
