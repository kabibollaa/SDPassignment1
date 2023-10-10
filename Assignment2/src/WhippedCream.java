public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream"; // Add Whipped Cream to the description
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.7; // Add the cost of Whipped Cream
    }
}
