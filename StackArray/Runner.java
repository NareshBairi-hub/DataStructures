package StackArray;

import java.util.Scanner;

public class Runner {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stack Size: ");
        int size = sc.nextInt();
        StackArray sa = new StackArray(size);

        int choice, data;
        do {
            System.out.println("\n--- Stack using Array Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    sa.push(data);
                    break;
                case 2:
                    sa.pop();
                    break;
                case 3:
                    sa.peek();
                    break;
                case 4:
                    sa.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
        sc.close();
    }
}
