package QueueLinkedList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList ql = new QueueLinkedList();

        int choice, data;
        do {
            System.out.println("\n--- Queue using Linked List Menu ---");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    ql.enqueue(data);
                    break;
                case 2:
                    ql.dequeue();
                    break;
                case 3:
                    ql.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
