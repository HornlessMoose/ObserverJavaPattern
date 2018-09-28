package smell;

public class User {

    private String userName;

    public User(String userName){
        this.userName = userName;
    }


    public void update(Product product){
        System.out.println("Ola " + userName + "\nChegou o produto " + product.getProductName() + "\n");
    }
}
