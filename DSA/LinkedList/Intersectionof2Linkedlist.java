package LinkedList;

class IntersectionOf2LinkedList {
    public Node intersectPoint(Node head1, Node head2) {
        Node temp1 = head1;
        int len1 = 0;
        while(temp1!=null){
            len1++;
            temp1 = temp1.next;
        }
        temp1 = head1;

        Node temp2 = head2;
        int len2 = 0;
        while(temp2!=null){
            len2++;
            temp2 = temp2.next;
        }
        temp2 = head2;

        if(len1>len2){
            for(int i=1;i<=len1-len2;i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=1;i<=len2-len1;i++){
                temp2 = temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static void main(String[] args) {
        Node a = new Node(); a.val = 10;
        Node b = new Node(); b.val = 20;
        Node c = new Node(); c.val = 30;
        Node d = new Node(); d.val = 40;
        Node e = new Node(); e.val = 50;
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node x = new Node(); x.val = 100;
        Node y = new Node(); y.val = 200;
        Node z = new Node(); z.val = 300;

        x.next = y;
        y.next = z;
        z.next = c;

        IntersectionOf2LinkedList obj = new IntersectionOf2LinkedList();
        System.out.println(obj.intersectPoint(a, x).val);
    }
}