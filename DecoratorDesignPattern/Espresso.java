public class Espresso implements  Coffee{

    @Override
    public double getCost() {
        return 7.0;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
    
}
