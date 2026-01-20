public class mainlink
{
    public static void main(String[] args) {

        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Front element: " + q.peek());
        System.out.println("Minimum: " + q.min());
        System.out.println("Maximum: " + q.max());

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front after dequeue: " + q.peek());
    }
}
