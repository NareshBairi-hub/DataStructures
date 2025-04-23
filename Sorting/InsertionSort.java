package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={21,3223,3232,54,6565,77878,98};
        int size=arr.length;
        System.out.println("Before Sorting");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        // Insertion sort 
        // we insert the elements in their right positions
        // Assume 1st element is in the right position
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                //shifting not swapping 
                arr[j+1]=arr[j];
                j--;
            }

            // Insert the key at the correct position
            arr[j+1]=key;
        }
        

        System.out.println("\nAfter Sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
