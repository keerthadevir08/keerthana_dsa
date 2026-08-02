
class Stack {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    Stack() {
        top = null;
    }

    // Push
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed");
    }

    // Pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped");
            top = top.next;
        }
    }

    // Top
    public void top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element = " + top.data);
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // isFull
    public boolean isFull() {
        return false;
    }

    // Size
    public int size() {
        int count = 0;
        Node temp = top;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
