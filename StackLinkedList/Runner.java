package StackLinkedList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList sl = new StackLinkedList();

        int choice, data;
        do {
            System.out.println("\n--- Stack using Linked List Menu ---");
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
                    sl.push(data);
                    break;
                case 2:
                    sl.pop();
                    break;
                case 3:
                    sl.peek();
                    break;
                case 4:
                    sl.display();
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
