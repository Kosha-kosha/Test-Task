public class Orders {

    private int user_id;
    private String status;
    private String created_at;

    public static Orders createOrder(){
        Orders orders = new Orders();
        System.out.println("User ID:");
        orders.setUser_id(Main.scanner.nextInt());
        System.out.println("Status:");
        orders.setStatus(Main.scanner.nextLine());
        System.out.println("Created At...:");
        orders.setCreated_at(Main.scanner.nextLine());
        return orders;
    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
