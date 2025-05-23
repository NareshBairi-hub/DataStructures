package Sorting;

public class QuickSort {

    public static void quickSort(int[] arr,int low, int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
        

    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];  // Choosing the last element as pivot
        int i = low - 1;  // Index for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return pivot index which is the actual index of pivox
    }
    public static void main(String[] args) {
        int arr[]={21,3223,3232,54,6565,77878,98};
        int size=arr.length;
        System.out.println("Before Sorting");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        quickSort(arr, 0, size-1);

        System.out.println("\nAfter Sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
