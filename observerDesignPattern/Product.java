
import java.util.ArrayList;
import java.util.List;

public class Product implements  Subject{

    private String productName;
    private boolean inStock = false;
    List<Observer> observerList;

    public Product(String productName) {
        this.productName = productName;
        observerList = new ArrayList<>();
    }

    @Override
    public void registerUser(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void deregisterUser(Observer ob) {
        observerList.remove(ob);
    }

    @Override
    public void notifyUser() {
        observerList.stream().forEach(ob -> ob.update(productName));
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if(inStock) {
            notifyUser();
        }
    }
    
}
