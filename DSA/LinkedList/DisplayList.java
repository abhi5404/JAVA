package LinkedList;


public class DisplayList {
    static class NodeDemo {
        int val;
        NodeDemo next;
        NodeDemo() {}
        NodeDemo(int val) { this.val = val; }
    }
    
    public static void displayRec(NodeDemo head){
        if(head == null) return;
        displayRec(head.next);
        System.out.print(head.val+" ");
    }
    public static void display(NodeDemo head){
        NodeDemo temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next; // VERY IMPORTANT
        }
//        for(NodeDemo temp = head;temp != null;temp = temp.next){
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();
    }
    public static void main(String[] args) {
        NodeDemo a = new NodeDemo(); a.val = 10; // head node
        NodeDemo b = new NodeDemo(); b.val = 200;
        NodeDemo c = new NodeDemo(); c.val = 30;
        NodeDemo d = new NodeDemo(); d.val = 40;
        NodeDemo e = new NodeDemo(); e.val = 50;
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        // display(a);
        // displayRec(a);
        System.out.println(get(a,4));
//        NodeDemo n = null;
//        n.val = 10;
//        System.out.println(n.val);
//        System.out.println(n.next);
    }

    private static int get(NodeDemo head, int idx) {
        NodeDemo temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
