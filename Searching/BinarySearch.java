package Searching;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
    //Initialize array or input some array using for loop
        int arr[] = {1,2,88,121,9,7,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the search element: ");
        int search=sc.nextInt();
        int temp=0;
        int l=0;
        int h=arr.length-1;

        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]==search){
                System.out.println("Element found at "+mid);
                temp=1;
                break;
            }
            else if(arr[mid]<search){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        if(temp==0)
            System.out.println("Element not found");

        sc.close();
    }
    
}

// hello