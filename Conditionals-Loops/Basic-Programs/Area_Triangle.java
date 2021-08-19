import java.util.*;

public class Area_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Right-Angled Triangle");
        System.out.println("2.Equilateral Triangle");
        System.out.println("3.Isosceles Triangle");

        while (true) {
            System.out.println("Choose the type of triangle:");
            int option = input.nextInt();

            if (option == 1 || option == 2 || option == 3) {
                if (option == 1) {
                    System.out.println("Enter the base of the triangle:");
                    int Base_RightAngledTriangle = input.nextInt();
                    System.out.println("Enter the height of the triangle:");
                    int Height_RightAngledTriangle = input.nextInt();
                    int Area_RightAngledTriangle = (Base_RightAngledTriangle + Height_RightAngledTriangle) / 2;
                    System.out.println("Area of the Right-Angled triangle is " + Area_RightAngledTriangle);
                }
                if (option == 2) {
                    System.out.println("Enter the length of the side of Equilateral Triangle: ");
                    int Side = input.nextInt();
                    double Area_EquilateralTriangle = (Math.sqrt(3) / 4) * (Side * Side);
                    System.out.println("Area of the Equilateral triangle is " + Area_EquilateralTriangle);
                }
                if (option == 3) {
                    System.out.println("Enter the length of one of the equal side sides:");
                    double a = input.nextDouble();
                    System.out.println("Enter the base of the triangle:");
                    double b = input.nextDouble();
                    double Area_IsoscelesTriangle = b * Math.sqrt(4 * (a * a) - (b * b)) / 4;
                    System.out.println("Area of the triangle is " + Area_IsoscelesTriangle);
                }
            } else if (option == 0) {
                break;
            } else {
                System.out.println("Wrong input !! Try again😞");
            }
        }
        input.close();

    }
}
