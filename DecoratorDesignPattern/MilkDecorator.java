
public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    
}
