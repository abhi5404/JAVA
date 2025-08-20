class Volume {
    // Cube
    double vol(double s) {
        return s * s * s;
    }

    // Cylinder
    double vol(double r, double h) {
        return Math.PI * r * r * h;
    }

    // Ellipsoid
    double vol(double a, double b, double c) {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }
}

public class VolMain {
    public static void main(String[] args) {
        Volume v = new Volume();

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Cube: java VolMain 1 side");
            System.out.println("Cylinder: java VolMain 2 radius height");
            System.out.println("Ellipsoid: java VolMain 3 a b c");
            return;
        }

        int ch = Integer.parseInt(args[0]);

        switch (ch) {
            case 1: // Cube
                if (args.length == 2) {
                    double s = Double.parseDouble(args[1]);
                    System.out.println("Volume of Cube = " + v.vol(s));
                } else {
                    System.out.println("Error: Cube needs 1 parameter (side)");
                }
                break;

            case 2: // Cylinder
                if (args.length == 3) {
                    double r = Double.parseDouble(args[1]);
                    double h = Double.parseDouble(args[2]);
                    System.out.println("Volume of Cylinder = " + v.vol(r, h));
                } else {
                    System.out.println("Error: Cylinder needs 2 parameters (radius, height)");
                }
                break;

            case 3: // Ellipsoid
                if (args.length == 4) {
                    double a = Double.parseDouble(args[1]);
                    double b = Double.parseDouble(args[2]);
                    double c = Double.parseDouble(args[3]);
                    System.out.println("Volume of Ellipsoid = " + v.vol(a, b, c));
                } else {
                    System.out.println("Error: Ellipsoid needs 3 parameters (a, b, c)");
                }
                break;

            default:
                System.out.println("Invalid choice! Use 1, 2 or 3.");
        }
    }
}

