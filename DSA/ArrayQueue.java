public class ArrayQueue {
    private int[] queue;
    private int front, rear, size;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            resize();
        }
        queue[++rear] = value;
        size++;
    }

    public void resize() {
        int[] newQueue = new int[queue.length * 2];
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }
        queue = newQueue;
        System.out.println("" + queue.length);
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("empty queue");
            return -1;
        }
        size--;
        return queue[front++];
    }

    public int peek() {
        return queue[front];

    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i] + "");
        }
        System.out.println();
    }

    public int min() {
        int min = queue[front];
        for (int i = front; i <= rear; i++) {
            if (queue[i] < min)
                min = queue[i];

        }
        return min;
    }
    public int max() {
        int max = queue[front];
        for (int i = front; i <= rear; i++) {
            if (queue[i] > max)
                max = queue[i];
        }
        return max;
    }

    }
