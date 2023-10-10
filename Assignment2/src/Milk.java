public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk"; // Add Milk to the description
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Add the cost of Milk
    }
}
