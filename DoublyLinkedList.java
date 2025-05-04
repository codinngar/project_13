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
            // if correct position is at the beginning
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
            // move pointer to the next element if it's not correct position
            } else {
                current = current.next;
            }
        }
    }

    public Integer getMin() {
        if (isEmpty()) {
            return null;
        }

        return head.data;
    }

    public Integer getMax() {
        if (isEmpty()) {
            return null;
        }

        return tail.data;
    }

    public Integer extractMin() {
        if (isEmpty()) {
            return null;
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

    public Integer extractMax() {
        if (isEmpty()) {
            return null;
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
