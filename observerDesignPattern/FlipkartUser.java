public class FlipkartUser implements Observer{

    private String name;

    public FlipkartUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println("Hello " + name + ". "+ product + " is availble right now. Please check it out before it sold out.");
    }
    
}
