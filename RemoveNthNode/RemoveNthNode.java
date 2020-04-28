package RemoveNthNode;


import java.util.ArrayList;
import java.util.List;

public class RemoveNthNode {

    public static void main(String[] args) {

        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4);
        n4.next = n5;
        ListNode n3 = new ListNode(3);
        n3.next = n4;
        ListNode n2 = new ListNode(2);
        n2.next = n3;
        ListNode n1 = new ListNode(1);
        n1.next = n2;

        ListNode result = removeNthFromEnd(n1, 2);
    }

    /**
     * Definition for singly-linked list.
     * struct ListNode {
     * int val;
     * ListNode *next;
     * ListNode(int x) : val(x), next(NULL) {}
     * };
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> listNodes = new ArrayList<>();
        ListNode currentNode = head;
        do {
            listNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        while (currentNode != null);
        int positionToDelete = listNodes.size() - n;
        if (positionToDelete == 0) {
            return head.next;
        }
        listNodes.get(positionToDelete-1).next = listNodes.get(positionToDelete).next;
        return head;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
