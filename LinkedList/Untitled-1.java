public class Node {
    int value;
    Node next;

    /**
     * Constructor for a Node
     * @param - the value to be added in the new Node to be added
     */
    public Node (int num) {
        value = num; //
        next = null; //sets the next Node as null
    }

    /**
     * This method adds a node at the end of the Linked List
     */
    public Node addNode (Node head, int value) {
        Node dummy = head;
        while (dummy.next != null) {
            head = node.next;
        }
        dummy.next = new Node(value);
        return head;
    }

}