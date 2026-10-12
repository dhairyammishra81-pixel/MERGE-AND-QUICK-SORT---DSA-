import java.util.Arrays;

public class quicksort {

   
    public static void main(String[] args) {
        int[] data = {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
        System.out.println("Unsorted Array: " + Arrays.toString(data));
        
       
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }

    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            int partitionIndex = partition(arr, low, high);

            
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
          
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; 
}
}
