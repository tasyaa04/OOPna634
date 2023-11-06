public class SinglyLinkedList {
    public Node head;
    public int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void add(int value) {
        Node newVal = new Node(value);
        newVal.next = head;
        head = newVal;
        length += 1;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
            length -= 1;
        }
    }

//    public void removeNth(int n) {
//        head = getNth(n).next;
//    }

   public int getHead() {
        return head.valueStored;
    }

    private Node getNth(int n) {
        Node currentElement = head;
        for (int i = 0; i < n; i++) {
            currentElement = currentElement.next;
        }
        return currentElement;
    }

    public int getNthValue(int n) {
        return getNth(n).valueStored;
    }

    public int getLength() {
        return length;
    }

    public boolean detectCycle() {
        Node current1 = head;
        Node current2 = head;
        while (current2 != null && current2.next != null) {
            current1 = current1.next;
            current2 = current2.next.next;
            if (current1 == current2) {
                return true;
            }
        }
        return false;
    }
}
