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
  
}

//key points:
// 1. Calculate the length of both linked lists.
// 2. Find the difference in lengths and move the pointer of the longer linked list ahead by that difference.
// 3. Move both pointers of the linked lists one step at a time until they point to the same node, which will be the intersection point. If they do not intersect, both pointers will eventually become null.
