package Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr,int low, int high){
        if(low<high){
            int mid=(low+high)/2;

            // Divide the array
            mergeSort(arr, low, mid);
            mergeSort(arr,mid + 1, high);

            merge(arr,low,mid,high);
        }

    }

    private static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1; // length of the 1st sub array
        int n2 = high-mid;  // length of the 2nd sub array

        int lArr[]=new int[n1];
        int rArr[]=new int[n2];

        for(int x=0;x<n1;x++){
            lArr[x]=arr[low+x];
        }

        for(int x=0;x<n2;x++){
            rArr[x]=arr[mid+1+x];
        }

        int i=0; //index of left sub array
        int j=0; //index of right sub array
        int k=low; // index of new sorted array 

        while(i<n1 && j<n2){
            if(lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
            }else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=rArr[j];
            j++;
            k++;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={21,3223,3232,54,6565,77878,98};
        int size=arr.length;
        System.out.println("Before Sorting");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        mergeSort(arr, 0, size-1);

        System.out.println("\nAfter Sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
