package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={21,3223,3232,54,6565,77878,98};
        int size=arr.length;
        int temp=0;
        System.out.println("Before Sorting");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        // Selection sort 
        // we select the min value 

        for(int i=0;i<size-1;i++){
            // We assume that first element to be the minimum value
            int minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            // swapping the actual min element(minIndex found) with the assumed one(i) 
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        

        System.out.println("\nAfter Sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
