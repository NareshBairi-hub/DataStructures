package Searching;
import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args){
        //Initialize array or input some array using for loop
        int arr[] = {1,2,88,121,9,7,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the search element: ");
        int search=sc.nextInt();
        int temp=0;
        // use for loop to iterate through each element

        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element found at "+i);
                temp=1;
                break;
            }
        }
        if(temp==0){
            System.out.println("Element not found");
        }
        sc.close();
    }
}