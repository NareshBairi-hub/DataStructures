package CircularLinkedList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();
        int choice, data, pos;
        do {
            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    cll.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    cll.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    cll.insertAtPosition(pos, data);
                    break;
                case 4:
                    cll.deleteAtBeginning();
                    break;
                case 5:
                    cll.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    cll.deleteAtPosition(pos);
                    break;
                case 7:
                    cll.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 8);
        sc.close();
    }
}
