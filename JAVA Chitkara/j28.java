class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class j28 {
    public static int findMiddleElement(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr.val;
    }

    public static Node insertElementAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        return head;
    }

    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int middleElement = findMiddleElement(head);
        System.out.println("Middle element: " + middleElement);

        head = insertElementAtEnd(head, 6);

        System.out.print("Linked list: ");
        printLinkedList(head);
    }

}
