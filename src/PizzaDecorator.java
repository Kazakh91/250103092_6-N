abstract class  PizzaDecorator implements Pizza{
    protected  Pizza tempPizza;

    public PizzaDecorator(Pizza newPizza){
        this.tempPizza =newPizza;
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public   double getCost() {
        return tempPizza.getCost();
    }
}
