package LinkedList;


class LinkedList {
    Node head;

    // Insert at Beginning
    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Insert After a given key
    void insertAfter(int key, int data) {
        Node temp = head;
        while (temp != null && temp.data != key)
            temp = temp.next;
        if (temp == null) {
            System.out.println("Key not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert at Given Position (0-based index)
    void insertAtPosition(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 0) {
            insertAtBegin(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of bounds. Inserting at end.");
            insertAtEnd(data);
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Value
    void deleteByValue(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }
        temp.next = temp.next.next;
    }

    // Delete by Position (0-based index)
    void deleteByPosition(int position) {
        if (head == null) return;

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search for a value
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Get length of Linked List
    int getLength() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Print Linked List
    void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}