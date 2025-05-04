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

        System.out.println("=".repeat(20) + " First test case " + "=".repeat(20));

        /* first test case */
        System.out.println("List before extraction:");
        list.display();

        System.out.println("Extract max: " + list.extractMax().data);
        System.out.println("Extract max: " + list.extractMax().data);
        System.out.println("Extract min: " + list.extractMin().data);

        System.out.println("List after extraction:");
        list.display();

        System.out.println("Get min: " + list.getMin().data);
        System.out.println("Get max: " + list.getMax().data);
        /* first test case */

        System.out.println("=".repeat(20) + " Second test case " + "=".repeat(19));

        /* second test case */
        System.out.println("List before extraction:");
        list.display();

        System.out.println("Extract min: " + list.extractMin().data);
        System.out.println("Extract min: " + list.extractMin().data);
        System.out.println("Extract max: " + list.extractMax().data);

        System.out.println("List after extraction:");
        list.display();

        System.out.println("Get min: " + list.getMin().data);
        System.out.println("Get max: " + list.getMax().data);
        /* second test case */

        System.out.println("=".repeat(20) + " Third test case " + "=".repeat(20));

        /* third test case */
        System.out.println("List before extraction:");
        list.display();

        System.out.println("Extract max: " + list.extractMax().data);
        System.out.println("Extract min: " + list.extractMin().data);
        System.out.println("Extract max: " + list.extractMax().data);

        System.out.println("List after extraction:");
        list.display();

        System.out.println("Get min: " + list.getMin());
        System.out.println("Get max: " + list.getMax());
        /* third test case */
    }
}