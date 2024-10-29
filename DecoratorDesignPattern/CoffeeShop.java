public class CoffeeShop {
    public static void main(String[] args) {
        Americano americano = new Americano();
        Coffee americanoWithMilk = new MilkDecorator(americano);
        Coffee americanoWithMilkandSugar = new SugarDecorator(americanoWithMilk);
        System.out.println(americanoWithMilkandSugar.getDescription() + " price:- " + americanoWithMilkandSugar.getCost());

        Coffee esproseeWithMilkwithSugar = new SugarDecorator(new MilkDecorator(new Espresso()));
        System.out.println(esproseeWithMilkwithSugar.getDescription() + " price:- " +  esproseeWithMilkwithSugar.getCost());

        Coffee cuppuchinoWithMilkandSugar = new MilkDecorator(new SugarDecorator(new Cuppuchino()));

        System.out.println(cuppuchinoWithMilkandSugar.getDescription() + " Price:- " +  cuppuchinoWithMilkandSugar.getCost());
    }
}
