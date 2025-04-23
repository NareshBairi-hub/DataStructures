package LinkedList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice, data, key, pos;

        do {
            System.out.println("\n----- Linked List Operations -----");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert After a Value");
            System.out.println("4. Insert at Position");
            System.out.println("5. Delete by Value");
            System.out.println("6. Delete by Position");
            System.out.println("7. Search");
            System.out.println("8. Get Length");
            System.out.println("9. Display List");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtBegin(data);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;

                case 3:
                    System.out.print("Enter key after which to insert: ");
                    key = sc.nextInt();
                    System.out.print("Enter value to insert: ");
                    data = sc.nextInt();
                    list.insertAfter(key, data);
                    break;

                case 4:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    list.insertAtPosition(pos, data);
                    break;

                case 5:
                    System.out.print("Enter value to delete: ");
                    data = sc.nextInt();
                    list.deleteByValue(data);
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    list.deleteByPosition(pos);
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    data = sc.nextInt();
                    if (list.search(data))
                        System.out.println("Value found.");
                    else
                        System.out.println("Value not found.");
                    break;

                case 8:
                    System.out.println("Length of List: " + list.getLength());
                    break;

                case 9:
                    list.printList();
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 10);
        sc.close();
    }
}
