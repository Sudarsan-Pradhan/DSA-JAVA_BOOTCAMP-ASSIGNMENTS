import java.util.*;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Volume of Cone");
        System.out.println("2.Volume of Prism");
        System.out.println("3.Volume of Cylinder");
        System.out.println("4.Volume of Sphere");
        System.out.println("5.Volume of Pyramid");
        float PI = (float) 3.1415926535897;

        while (true) {
            System.out.print("Choose the option given above:");
            try {
                int option = in.nextInt();

                if (option == 1 || option == 2 || option == 3 || option == 4 || option == 5) {
                    if (option == 1) {
                        System.out.print("Enter the base radius of the cone:");
                        float radius = in.nextFloat();
                        System.out.print("Enter  height  of the cone:");
                        float height = in.nextFloat();
                        float volume = (1 / 3) * PI * radius * radius * height;
                        System.out.println("Volume of the cone is " + volume + " mtr.³");

                    }
                    if (option == 2) {
                        System.out.print("Enter the base area of the prism:");
                        float baseArea = in.nextFloat();
                        System.out.print("Enter the length of the prism:");
                        float Length = in.nextFloat();
                        float volume = baseArea * Length;
                        System.out.println("Volume of the prism is " + volume + " mtr.³");

                    }
                    if (option == 3) {
                        System.out.print("Enter the radius of the cylinder:");
                        float radius = in.nextFloat();
                        System.out.print("Enter  height  of the cylinder:");
                        float height = in.nextFloat();
                        float volume = PI * radius * radius * height;
                        System.out.println("Volume of the cylinder is " + volume + " mtr.³");

                    }
                    if (option == 4) {
                        System.out.print("Enter the radius of the sphere:");
                        float radius = in.nextFloat();
                        float volume = 4 / 3 * PI * radius * radius * radius;
                        System.out.println("Volume of the Sphere  is " + volume + " mtr.³");

                    }
                    if (option == 5) {
                        System.out.print("Enter the base area of the pyramid:");
                        float baseArea = in.nextFloat();
                        System.out.print("Enter the height of the pyramid:");
                        float height = in.nextFloat();
                        float volume = baseArea * height;
                        System.out.println("Volume of the pyramid is " + volume + " mtr.³");

                    }
                } else if (option == 0) {
                    break;

                } else {
                    System.out.println("Wrong input !! Try again...😞");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input!! Program terminated.......");
                break;
            }

        }
        in.close();
    }
}
