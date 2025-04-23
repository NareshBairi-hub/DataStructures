package QueueArray;

public class QueueArray {
    int front, rear, maxSize;
    int[] queue;

    QueueArray(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = rear = -1;
    }

    void enqueue(int data) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            queue[++rear] = data;
            System.out.println("Element Inserted: " + data);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Element Deleted: " + queue[front++]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}
