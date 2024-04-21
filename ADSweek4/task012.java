package ADSweek4;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        this.next = null;
    }
}

public class task012 {
    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(7);

        ListNode middleNode = findMiddle(head);
        ListNode middleNode2 = findMiddle(head2);

        System.out.println("The middle of the first linked list (even number of nodes): " + middleNode.val);
        System.out.println("The middle of the second linked list (odd number of nodes): " + middleNode2.val);
    }
}
