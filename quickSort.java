import java.util.Arrays;
import static java.lang.System.*;
public class quickSort
{
  public static void main(String[] args)
  {
    int[] array1 = {7,2,5,9,6,3,1,4};        
    out.println("before Quick sort: " + Arrays.toString(array1));
    quickSort(array1,0,array1.length-1);
    out.println("\nafter Quick sort: " + Arrays.toString(array1));       
    System.out.println("\n");
    
    int[] array2 = {10,24,30,5,2,1,0,8,18,3,22,4,19,8};      
    out.println("before Quick sort: " + Arrays.toString(array2));
    quickSort(array2,0,array2.length-1);
    out.println("\nafter Quick sort: " + Arrays.toString(array2));       
   
        
  }
  public static void quickSort(int arr[], int low, int high)
  {
      if ( low < high )
      {
          int pivotIndex = partition(arr, low, high);
          quickSort(arr, low, pivotIndex-1);
          quickSort(arr, pivotIndex+1, high);        
      }
  }
  
  /* This method takes last element as pivot, places the pivot element at its correct position in sorted array, and places all smaller element to left of pivot and all greater elements to right of pivot */
  public static int partition(int arr[], int low, int high)
  {
    out.println("calling partition(arr, " + low + ", " + high + ")");
    int pivot = arr[high];
    int pivotIndex= low-1; // this index divides numbers less than or equal to pivot from numbers greater than pivot
    for ( int j=low; j<high; j++)
    {
        // if current element is smaller than or equal to pivot, swap arr[index] and arr[j]
        if ( arr[j]<= pivot )
        {
            pivotIndex++;
            swap(arr, pivotIndex, j);
            System.out.println(Arrays.toString(arr));                   
        }
    }
    pivotIndex++;
    swap(arr, pivotIndex, high);
    System.out.println("pivot index: " + pivotIndex);
    System.out.println(Arrays.toString(arr));
    //index is the spot where pivot is now located so that all elements to the left are smaller than the pivot and all elements
    //to the right are greater than the element.
    return pivotIndex;
  }
  public static void swap(int[] array, int i, int j)
  {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    
  }
}
