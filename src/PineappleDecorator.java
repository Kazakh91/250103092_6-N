public class PineappleDecorator extends PizzaDecorator{
    public PineappleDecorator(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Pineapple";
    }

    @Override
    public double  getCost() {
        return tempPizza.getCost() + 1.5;
    }
}
