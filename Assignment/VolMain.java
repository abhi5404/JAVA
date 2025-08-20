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

        System.out.println("1. Cube  2. Cylinder  3. Ellipsoid");
        System.out.print("Enter choice: ");
        int ch = Integer.parseInt(br.readLine());

        switch (ch) {
            case 1:
                System.out.print("Side: ");
                double s = Double.parseDouble(br.readLine());
                System.out.println("Volume = " + v.vol(s));
                break;

            case 2:
                System.out.print("Radius: ");
                double r = Double.parseDouble(br.readLine());
                System.out.print("Height: ");
                double h = Double.parseDouble(br.readLine());
                System.out.println("Volume = " + v.vol(r, h));
                break;

            case 3:
                System.out.print("a: ");
                double a = Double.parseDouble(br.readLine());
                System.out.print("b: ");
                double b = Double.parseDouble(br.readLine());
                System.out.print("c: ");
                double c = Double.parseDouble(br.readLine());
                System.out.println("Volume = " + v.vol(a, b, c));
                break;

            default:
                System.out.println("Wrong choice!");
        }
    }
}



  