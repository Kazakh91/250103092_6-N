public class Main {
    public static void main(String[] args) {
        // Stacking 3 toppings: Cheese, Olives, and Pineapple on a PlainPizza
        Pizza customPizza = new PineappleDecorator(new OlivesDecorator(new CheeseDecorater(new PlainPizza())));

        // Print final description and total cost
        System.out.println("Description: " + customPizza.getDescription());
        System.out.println("Total Cost: $" + customPizza.getCost());
    }
}