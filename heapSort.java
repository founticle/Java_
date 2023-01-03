import java.util.Arrays;

/*  
--Time Complexity : Worst case = Best Case = O(n log n)
    
--Space Complexity : O(1), since heap sort is an in-place sorting algorithm and any additional data structure isn't used
*/ 


public class heapSort{

  public static void sort(int[] array) {
    // max heap
    for (int i = array.length / 2 - 1; i >= 0; i--) {
      heapify(array, array.length, i);
    }

    // Extract elements from the heap
    for (int i = array.length - 1; i >= 0; i--) {
      
      int temp = array[0];
      array[0] = array[i];
      array[i] = temp;

      // On the reduced heap, run max heapify.
      heapify(array, i, 0);
    }
  }

 
  public static void heapify(int[] array, int n, int i) {
    int largest = i; // Initialize largest as root
    int l = 2 * i + 1; 
    int r = 2 * i + 2; 

    // If left child is larger than root
    if (l < n && array[l] > array[largest]) {
      largest = l;
    }

    if (r < n && array[r] > array[largest]) {
      largest = r;
    }

    // If largest is not root
    if (largest != i) {
      int swap = array[i];
      array[i] = array[largest];
      array[largest] = swap;


      heapify(array, n, largest);
    }
  }

  public static void main(String[] args) {
    int[] array = {4, 10, 3, 5, 1, 7};

    sort(array);

    System.out.println(Arrays.toString(array));
  }
}
