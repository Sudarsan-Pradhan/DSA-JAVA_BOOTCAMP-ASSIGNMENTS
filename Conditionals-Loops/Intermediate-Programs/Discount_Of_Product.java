import java.io.*;

public class Discount_Of_Product {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the price of the product: ");
        int productPrice = Integer.parseInt(reader.readLine());
        System.out.println("Enter the discount amount of the product: ");
        float DiscountRate = Float.parseFloat(reader.readLine());
        float percentage = DiscountRate / 100;// Represent the discount percentage in decimal form
        float productValue = productPrice - (productPrice * percentage);
        System.out.println("The discounted price of the product is: " + productValue);

    }
}
