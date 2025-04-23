package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int arr[]={21,3223,3232,54,6565,77878,98};
        int size=arr.length;
        int temp=0;
        System.out.println("Before Sorting");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        // Bubble sort 

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("\nAfter Sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
