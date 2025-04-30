import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int randomInt = random.nextInt(100);
            doublyLinkedList.insert(randomInt);
        }

        doublyLinkedList.display();

        System.out.println("Min: " + doublyLinkedList.extractMin());
        System.out.println("Min: " + doublyLinkedList.extractMin());
        System.out.println("Max: " + doublyLinkedList.extractMax());

        doublyLinkedList.display();
    }
}