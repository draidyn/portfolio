class LinkedList {
    Node head; //head of the linked list

    // Node in the linked list
    static class Node {
        int value;
        Node next;
    }

    Node addNode(int value, Node head) {
        Node parseHead = head; //creates a pointer to the head for parsing
        while (parseHead.next != null) parseHead = parseHead.next; //looking for the end of the list
        parseHead.next = new Node(value);
        return head;
    }

}