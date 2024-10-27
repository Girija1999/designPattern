public class Driver {
    public static void main(String[] args) {
        Product product = new Product("Iphone 17");

        FlipkartUser user1 = new FlipkartUser("Girija");
        FlipkartUser user2 = new FlipkartUser("Akash");
        FlipkartUser user3 = new FlipkartUser("Binod");    

        product.registerUser(user1);
        product.registerUser(user2);
        product.registerUser(user3);

        product.setInStock(true);

        product.deregisterUser(user1);

        product.setInStock(true);


        


    }
}
