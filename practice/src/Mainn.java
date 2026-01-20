public class Mainn {
    public static void main(String[] args) {

        // Step 1: Queue object banao (initial size = 3)
        ArrayQueue q = new ArrayQueue(3);

        // Step 2: Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // Ye resize trigger karega
        q.enqueue(40);

        // Step 3: Display queue
        System.out.print("Queue elements: ");
        q.display();

        // Step 4: Peek
        System.out.println("Front element: " + q.peek());

        // Step 5: Min & Max
        System.out.println("Minimum: " + q.min());
        System.out.println("Maximum: " + q.max());

        // Step 6: Dequeue
        System.out.println("Removed: " + q.dequeue());

        // Display again
        System.out.print("Queue after dequeue: ");
        q.display();
    }
}
