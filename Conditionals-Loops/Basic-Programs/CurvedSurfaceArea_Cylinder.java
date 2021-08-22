import java.util.*;

public class CurvedSurfaceArea_Cylinder {

    public static void main(String[] args) {
        float PI = (float) 3.1415926535897;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base radius of the cylinder(in mtr.):");
        float baseRad = input.nextFloat();
        System.out.print("Enter the height of the cylinder(in mtr.):");
        float height = input.nextFloat();
        float curvedSurfaceAreaCylinder = 2 * PI * baseRad * height;
        System.out.println("The curved surface area of the cylinder is " + curvedSurfaceAreaCylinder + " mtr.²");
        input.close();

    }
}
