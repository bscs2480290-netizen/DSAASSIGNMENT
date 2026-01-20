public class dubblylinklist {
    class Node {
        int data;
       Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertatbeginning(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void insertatlast(int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void displayforward() {
        Node temp = head;
        System.out.println("forward:");
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }
    }

    public void displayback() {
        Node temp = tail;
        System.out.println("backward:");
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.prev;
        }
    }

    public void deletefirst() {
        if (head == null)
            return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deletelast() {
        if (tail == null)
            return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void detelebyvalue(int value) {
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == head) {
            deletefirst();
        } else if (temp == tail) {
            deletelast();

        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void deleteBeforeValue(int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null || temp.prev == null) return;

        Node toDelete = temp.prev;

        if (toDelete == head) {
            deletefirst();
        } else {
            toDelete.prev.next = temp;
            temp.prev = toDelete.prev;
        }
    }

    public void deleteAfterValue(int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return;

        Node toDelete = temp.next;

        if (toDelete == tail) {
            deletelast();
        } else {
            temp.next = toDelete.next;
            toDelete.next.prev = temp;
        }
    }

    public void findMinMax() {
        if (head == null) return;

        int min = head.data;
        int max = head.data;

        Node temp = head;
        while (temp != null) {
            if (temp.data < min) min = temp.data;
            if (temp.data > max) max = temp.data;
            temp = temp.next;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

}
