public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // inserting items
        doublyLinkedList.insert(6);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(7);
        doublyLinkedList.insert(9);
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(8);
        doublyLinkedList.insert(0);
        doublyLinkedList.insert(7);

        /* first test case */
        doublyLinkedList.display();

        doublyLinkedList.extractMax();
        doublyLinkedList.extractMax();
        doublyLinkedList.extractMin();

        doublyLinkedList.display();

        System.out.println("Min: " + doublyLinkedList.getMin());
        System.out.println("Max: " + doublyLinkedList.getMax());
        System.out.println();
        /* first test case */

        /* second test case */
        doublyLinkedList.display();

        doublyLinkedList.extractMin();
        doublyLinkedList.extractMin();
        doublyLinkedList.extractMax();

        doublyLinkedList.display();

        System.out.println("Min: " + doublyLinkedList.getMin());
        System.out.println("Max: " + doublyLinkedList.getMax());
        /* second test case */
    }
}