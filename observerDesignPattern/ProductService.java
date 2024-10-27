
import java.util.ArrayList;
import java.util.List;

public class ProductService implements  Product{

    private String productName;
    private boolean inStock = false;
    List<Observer> observerList = new ArrayList<>();

    public ProductService(String productName) {
        this.productName = productName;
    }

    @Override
    public void registerUser(Observer o) {
        observerList.add(o);
    }

    @Override
    public void deregisterUser(Observer o) {
        observerList.remove(o);
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
