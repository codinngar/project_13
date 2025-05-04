class Link {
    public int data; // data item
    public Link next; // next link in list
    public Link previous; // last link in list

    public Link(int d) { // constructor
        data = d;
        next = null;
        previous = null;
    }
}

class DoublyLinkedList {
    private Link first; // refrence to first item
    private Link last; // refrence to last item

    public DoublyLinkedList() { // constructor
        first = null;
        last = null;
    }

    // check if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    // insert item in order
    public void insert(int data) {
        Link newLink = new Link(data);

        if (isEmpty()) { // if list is empty
            first = newLink;
            last = newLink;
            return;
        }

        Link current = first; // start from the beginning
        while (current != null) {
            if (data <= current.data && current == first) { // insert at beginning
                current.previous = newLink;
                newLink.next = current;
                first = newLink;
                return;
            } else if (data > current.data && current == last) { // insert at end
                current.next = newLink;
                newLink.previous = current;
                last = newLink;
                return;
            } else if (data <= current.data) { // insert in middle
                newLink.next = current;
                newLink.previous = current.previous;
                current.previous.next = newLink;
                current.previous = newLink;
                return;
            } else { // move to next item
                current = current.next;
            }
        }
    }

    // Get minimum value
    public Link getMin() {
        return first;
    }

    // Get maximum item
    public Link getMax() {
        return last;
    }

    // Extract minimum item
    public Link extractMin() {
        Link temp = first;

        if (first == null) // if list is empty
            return first;
        else if (first.next == null) // if only one item
            last = null;
        else
            first.next.previous = null; // remove first item

        first = first.next; // move reference to next item
        return temp;
    }

    // Extract maximum item
    public Link extractMax() {
        Link temp = last;

        if (first == null) // if list is empty
            return first;
        if (first.next == null) // if only one item
            first = null;
        else
            last.previous.next = null; // remove first item

        last = last.previous; // move reference to next item
        return temp;
    }

    // Display list from first to last
    public void display() {
        if (first == null)
        System.out.println("List is empty");

        Link current = first;
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

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // insert items in list
        list.insert(6);
        list.insert(2);
        list.insert(4);
        list.insert(7);
        list.insert(9);
        list.insert(1);
        list.insert(8);
        list.insert(0);
        list.insert(7);

        System.out.println("=".repeat(50));

        /* first test case */
        System.out.println("List before extraction:");
        list.display();

        list.extractMax();
        list.extractMax();
        list.extractMin();

        System.out.println("List after extraction:");
        list.display();

        System.out.println("Min: " + list.getMin().data);
        System.out.println("Max: " + list.getMax().data);
        /* first test case */

        System.out.println("=".repeat(50));

        /* second test case */
        System.out.println("List before extraction:");
        list.display();

        list.extractMin();
        list.extractMin();
        list.extractMax();

        System.out.println("List after extraction:");
        list.display();

        System.out.println("Min: " + list.getMin().data);
        System.out.println("Max: " + list.getMax().data);
        /* second test case */

        System.out.println("=".repeat(50));

        /* third test case */
        list.extractMax();
        list.extractMin();
        list.extractMax();

        list.display();
        /* third test case */
    }
}