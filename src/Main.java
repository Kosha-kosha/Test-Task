import java.util.Scanner;

public class Main {
   public static Scanner scanner;


    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("Name:");
        product.setName(scanner.nextLine());
        System.out.println("Price:");

        product.setPrice(scanner.nextInt());
        System.out.println("Status");
        System.out.println("Date:");
        product.setDate(scanner.nextLine());

        Product newProduct = new Product(product.getName(),product.getPrice(), product.getCreated_at(), product.getStatus());
        DatabaseHandler dbHandler = new DatabaseHandler();
        dbHandler.addProduct(newProduct);

    }


}
