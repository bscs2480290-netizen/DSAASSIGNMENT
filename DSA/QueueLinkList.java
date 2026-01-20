

// Queue using Linked List
class QueueLinkList {
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node front, rear;

    // Enqueue: add element at rear
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {        // queue empty
            front = rear = newNode;
            return;
        }
        rear.next = newNode;        // link new node
        rear = newNode;             // move rear
    }

    // Dequeue: remove element from front
    public int dequeue() {
        if (front == null) {        // queue empty
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = front.data;   // save value
        front = front.next;         // move front
        if (front == null)           // if queue empty now
            rear = null;
        return removed;
    }

    // Peek: front element
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Display queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find minimum element
    public int min() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int min = front.data;
        Node temp = front;
        while (temp != null) {
            if (temp.data < min)
                min = temp.data;
            temp = temp.next;
        }
        return min;
    }

    // Find maximum element
    public int max() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
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

