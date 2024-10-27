public interface Product {
    public void registerUser(Observer o);

    public void deregisterUser(Observer o);

    public void notifyUser();
}
