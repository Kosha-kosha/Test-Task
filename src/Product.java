import java.util.Scanner;

public class Product {
    public static Scanner scanner;
    private String name;
    private int price;
    private enum status{out_of_stock, in_stock, running_low};
    private String created_at;
    private status status;

    public Product(String name, int price, String created_at, Product.status status) {
        this.name = name;
        this.price = price;
        this.created_at = created_at;
        this.status = status;
    }

    public Product() {

    }


    public status getStatus() {
        return status;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCreated_at() {
        return created_at;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDate(String created_at) {
        this.created_at = created_at;
    }
}
