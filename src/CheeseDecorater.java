 class CheeseDecorater extends PizzaDecorator{
    public CheeseDecorater(Pizza newPizza){
        super(newPizza);
    }
    @Override
     public String getDescription(){
        return tempPizza.getDescription() + "Cheese";

    }
    @Override
     public double  getCost(){
     return tempPizza.getCost() + 2;
    }
}
