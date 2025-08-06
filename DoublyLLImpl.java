class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert at start
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert at end
    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Insert at specific position
    public void addPosition(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Position");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while (i < index-1) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    // Delete first node
    public void removeFirst() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Delete last node
    public void removeLast() {
        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // Delete node by position
    public void removeAtPosition(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Position");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node temp = head;
        int i=0;
        while (i<index-1) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    // Print from head to tail
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print from tail to head
    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Get size of list
    public int getSize() {
        return size;
    }
}

public class DoublyLLImpl {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(30);
        dll.addEnd(40);
        dll.addPosition(1, 35);
        dll.addEnd(50);

        System.out.print("Forward: ");
        dll.printForward();

        System.out.print("Backward: ");
        dll.printBackward();

        dll.removeAtPosition(1);

        System.out.print("After deletion (Forward): ");
        dll.printForward();
    }
}
