import java.util.*;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = in.nextDouble();
        double pi = 3.14159265359;
        double areaCircle = pi * (radius * radius);
        System.out.println("Area of the circle is " + areaCircle);
        in.close();
    }
}
