package DoublyLinkedList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice, data, pos;
        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Backward");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtPosition(pos, data);
                    break;
                case 4:
                    dll.deleteAtBeginning();
                    break;
                case 5:
                    dll.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    dll.deleteAtPosition(pos);
                    break;
                case 7:
                    dll.displayForward();
                    break;
                case 8:
                    dll.displayBackward();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 9);

        sc.close();
    }
}
