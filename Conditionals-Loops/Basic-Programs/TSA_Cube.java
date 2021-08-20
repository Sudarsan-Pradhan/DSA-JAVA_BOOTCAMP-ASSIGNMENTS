import java.io.*;

public class TSA_Cube {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the edge length of the cube(in mtr.):");
        float side = Integer.parseInt(in.readLine());
        float TSAcube = 6 * side * side;
        System.out.println("The total surface area of the cube is " + TSAcube + " mtr.²");
    }
}
