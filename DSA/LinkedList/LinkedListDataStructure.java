package LinkedList;

class NodeDemo{ // user defined data type
    int val;
    NodeDemo next; // null
    NodeDemo(){
    }
    NodeDemo(int val){
        this.val = val;
    }
}
class Linkedlist{ // user defined data structure
    NodeDemo head; // null
    NodeDemo tail; // null;
    int size;
    int search(int val){
        if(head==null) return -1;
        NodeDemo temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void addAtHead(int val) {
        NodeDemo temp = new NodeDemo(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        if(tail==null){
            addAtHead(val);
            return;
        }
        NodeDemo temp = new NodeDemo(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;
    }
    void display() {
        if(head==null) return;
        NodeDemo temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx) {
        NodeDemo temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid Index!");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            NodeDemo temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            NodeDemo t = new NodeDemo(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index!");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        NodeDemo temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size-1) tail = temp; // we are deleting tail
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.deleteAtHead();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40); ll.display();
        ll.addAtHead(50);
        ll.addAtHead(60); ll.display();
        ll.deleteAtHead(); ll.display();
        System.out.println(ll.size);
        ll.insert(45,2); ll.display();
        System.out.println(ll.get(4));
        ll.delete(3); ll.display();
    }
}
