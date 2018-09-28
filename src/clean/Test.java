package clean;


public class Test {
    public static void main(String[] args) {

        User user1 = new User("Allef");
        User user2 = new User("Elias");
        Product laptop = new Product("Laptop");
        Product PC = new Product("PC");
        Product router = new Product("Router");

        laptop.attach(user1);
        PC.attach(user1);
        PC.attach(user2);
        router.attach(user2);

        laptop.setState(true);
        PC.setState(true);
        router.setState(true);




    }

}
