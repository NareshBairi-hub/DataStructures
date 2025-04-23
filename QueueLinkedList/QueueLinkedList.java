package QueueLinkedList;

public class QueueLinkedList {
    Node front, rear;

    QueueLinkedList() {
        front = rear = null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Element Inserted: " + data);
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Element Deleted: " + front.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue Elements: ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
