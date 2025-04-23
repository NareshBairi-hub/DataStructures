package CircularLinkedList;

public class CircularLinkedList {
    CNode last;

    void insertAtBeginning(int data) {
        CNode newNode = new CNode(data);
        if (last == null) {
            last = newNode;
            last.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
    }

    void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (last == null) {
            last = newNode;
            last.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    void insertAtPosition(int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        CNode temp = last.next;
        for (int i = 1; temp != last && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == last && pos != 2) {
            System.out.println("Position out of range");
            return;
        }
        CNode newNode = new CNode(data);
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == last) {
            last = newNode;
        }
    }

    void deleteAtBeginning() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        if (last.next == last) {
            last = null;
            return;
        }
        last.next = last.next.next;
    }

    void deleteAtEnd() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        if (last.next == last) {
            last = null;
            return;
        }
        CNode temp = last.next;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
    }

    void deleteAtPosition(int pos) {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 1) {
            deleteAtBeginning();
            return;
        }
        CNode temp = last.next;
        for (int i = 1; temp != last && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == last.next) {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == last.next) {
            last = temp;
        }
    }

    void display() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        CNode temp = last.next;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(Back to Head)");
    }
}
