public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(Pizza newPizza){
        super(newPizza);
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Olives";
    }

    @Override
    public double  getCost() {
        return tempPizza.getCost() + 1;
    }
}
