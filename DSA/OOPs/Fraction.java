package OOPs;

public class Fraction {
    int num;
    int den;
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }
    void print(){
        System.out.println(num + "/" + den);
    }
    void add(Fraction f){
        num = num * f.den + den * f.num;
        den = den * f.den;
    }
    void multiply(Fraction f){
        num = num * f.num;
        den = den * f.den;
    }
    void divide(Fraction f){
        num = num * f.den;
        den = den * f.num;
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5, 6);
        f1.print();
        f2.print();
        // f1.add(f2);
        // System.out.println("After addition:");
        // f1.print();
        // f1.multiply(f2);
        // System.out.println("After multiplication:");
        // f1.print();
        f1.divide(f2);
        System.out.println("After division:");
        f1.print();
    }
}
