package LinkedList;

class DeleteNodeInALinkedListSolution {
    public void deleteNode(ListNode target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }
}

