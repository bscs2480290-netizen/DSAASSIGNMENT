
// Main class to test QueueLinkList
public class mainlink {
    public static void main(String[] args) {

        QueueLinkList q = new QueueLinkList();

        // Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        // Display queue
        System.out.print("Queue elements: ");
        q.display();

        // Peek front
        System.out.println("Front element: " + q.peek());

        // Min & Max
        System.out.println("Minimum: " + q.min());
        System.out.println("Maximum: " + q.max());

        // Dequeue elements
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        // Display after dequeue
        System.out.print("Queue after dequeue: ");
        q.display();

        // Peek again
        System.out.println("Front element: " + q.peek());

        // Min & Max again
        System.out.println("Minimum: " + q.min());
        System.out.println("Maximum: " + q.max());
    }
}