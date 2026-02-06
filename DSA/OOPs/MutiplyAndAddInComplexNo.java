package OOPs;

public class MutiplyAndAddInComplexNo {
     int x;
    int y;
    public MutiplyAndAddInComplexNo(int x, int y) {
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
    void add(MutiplyAndAddInComplexNo z){
        x += z.x;
        y += z.y;
    }
        public static void main(String[] args) {
            MutiplyAndAddInComplexNo z1 = new MutiplyAndAddInComplexNo(3, 4);
            MutiplyAndAddInComplexNo z2 = new MutiplyAndAddInComplexNo(5, -2);
            z1.print();
            z2.print();
            z1.add(z2);
            System.out.println("After addition:");
            z1.print();
        }
}
