class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LinkedListQueue {
    Node front, rear;

    // Enqueue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return removed;
    }

    // Peek
    public int peek() {
        return front.data;
    }

    // Find Min
    public int min() {
        int min = front.data;
        Node temp = front;
        while (temp != null) {
            if (temp.data < min)
                min = temp.data;
            temp = temp.next;
        }
        return min;
    }

    // Find Max
    public int max() {
        int max = front.data;
        Node temp = front;
        while (temp != null) {
            if (temp.data > max)
                max = temp.data;
            temp = temp.next;
        }
        return max;
    }
}
