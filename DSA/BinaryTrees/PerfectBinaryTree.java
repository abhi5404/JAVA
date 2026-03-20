package BinaryTrees;

public class PerfectBinaryTree {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4     2
        //   /   \ /   \
        // -1    1 6    9
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println(isPerfect(a));
    }
    private static boolean isPerfect(Node root) {
        if (root == null) return true;
        int levels = levels(root);
        int maxNodes = (int) Math.pow(2, levels) - 1;
        int count = countNodes(root);
        return count == maxNodes;
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



