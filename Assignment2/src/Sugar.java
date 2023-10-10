public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar"; // Add Sugar to the description
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2; // Add the cost of Sugar
    }
}
