package smell;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Allef"));
        users.add(new User("Elias"));


        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("PC"));
        products.add(new Product("Laptop"));

        for (Product product:products) {
            for (User user:users) {
                user.update(product);
            }
        }

    }
}
