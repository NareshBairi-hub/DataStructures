package StackArray;

public class StackArray {
    int top;
    int maxSize;
    int[] stack;

    StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = data;
            System.out.println("Element Pushed: " + data);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Element Popped: " + stack[top--]);
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack Elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
