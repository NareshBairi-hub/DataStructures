package StackLinkedList;

public class StackLinkedList {
    Node top;

    StackLinkedList() {
        top = null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Element Pushed: " + data);
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Element Popped: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + top.data);
        }
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack Elements: ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
