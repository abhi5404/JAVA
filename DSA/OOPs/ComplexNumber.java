package OOPs;

public class ComplexNumber {
    int x;
    int y;
    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>=0){
            System.out.println(x+" + "+y+"i");
        }
        else{
            System.out.println(x+" - "+(-y)+"i");
        }
    }
        public static void main(String[] args) {
            ComplexNumber z1 = new ComplexNumber(3, 4);
            ComplexNumber z2 = new ComplexNumber(5, -2);
            z1.print();
            z2.print();
        }
}
