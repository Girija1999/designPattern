public class FlipkartUser implements Observer{

    private String userName;

    public FlipkartUser(String name) {
        this.userName = name;
    }

    @Override
    public void update(String product) {
        System.out.println("Hello " + userName + ". "+ product + " is availble right now. Please check it out before it sold out.");
    }
    
}
