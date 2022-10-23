public class LinkLists {

    private ListNode head;

    private static class ListNode {
        public ListNode currend;
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.currend = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public boolean find(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public ListNode get(int value) {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null) {
            if (slowPtr.data == value) {
                fastPtr = null;
            } else {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
        }
        return slowPtr;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public static void main(String[] args) {
        LinkLists sll = new LinkLists();
        sll.head = new ListNode(10);

        sll.insert(1, 158);
        sll.insert(2, 8);
        sll.insert(2, 11);
        sll.insert(1, 13);
        sll.insert(5, 35);

        sll.display();
        System.out.println();
        System.out.println("length is - " + sll.length());

        try {
            ListNode middleNode = sll.get(13);
            System.out.println("Node is - " + middleNode.data);
        } catch (Exception n) {
            System.out.println("Not found");
        }

        sll.delete(3);
        System.out.println();
        sll.display();
    }
}
