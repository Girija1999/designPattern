public class Americano implements  Coffee{

    @Override
    public double getCost() {
        return 6.5;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
    
}
