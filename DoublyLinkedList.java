public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node current = head;
        while (current != null) {
            // if correct position is at the beginnin
            if (data <= current.data && current == head) {
                current.previous = newNode;
                newNode.next = current;
                head = newNode;
                return;
                // if correct position is at the end
            } else if (data > current.data && current == tail) {
                current.next = newNode;
                newNode.previous = current;
                tail = newNode;
                return;
                // if correct position is between two numbers
            } else if (data <= current.data) {
                newNode.next = current;
                newNode.previous = current.previous;
                current.previous.next = newNode;
                current.previous = newNode;
                return;
            } else {
                current = current.next;
            }
        }
    }

    public int getMin() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return head.data;
    }

    public int getMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return tail.data;
    }

    public int extractMin() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int min = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.previous = null;
        }

        return min;
    }

    public int extractMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int max = tail.data;
        tail = tail.previous;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }

        return max;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
