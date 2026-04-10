package BinaryTrees;

public class CompleteBinaryTree {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4     2
        //   /   \ /
        // -1    1 6
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        System.out.println(isComplete(a));
    }
    private static boolean isComplete(Node root) {
        if (root == null) return true;
        int levels = levels(root);
        int maxNodes = (int) Math.pow(2, levels) - 1;
        int count = countNodes(root);
        return count == maxNodes || count == maxNodes - 1;
    }
    private static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    private static int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}
