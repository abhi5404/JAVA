import java.io.*;

class Vol {
    double vol(double s) {
        return s * s * s;
    }
    double vol(double r, double h) {
        return Math.PI * r * r * h;
    }
    double vol(double a, double b, double c) {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }
}

public class VolMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vol v = new Vol();


  