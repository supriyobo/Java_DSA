class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseKNodes(head, k);
    }

    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    ListNode getKthNode(ListNode temp, int k) {
        k--;

        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }

        return temp;
    }

    ListNode reverseKNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while (temp != null) {
            ListNode kthNode = getKthNode(temp, k);

            if (kthNode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            reverseList(temp);

            if (temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }
}
