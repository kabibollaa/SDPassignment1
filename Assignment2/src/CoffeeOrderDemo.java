public class CoffeeOrderDemo {
    public static void main(String[] args) {
        // Create a base coffee order
        Coffee espresso = new Espresso();
        System.out.println("Base Coffee: " + espresso.getDescription() + " Cost: $" + espresso.cost());

        // Add Milk to the coffee
        Coffee espressoWithMilk = new Milk(espresso);
        System.out.println("Espresso with Milk: " + espressoWithMilk.getDescription() + " Cost: $" + espressoWithMilk.cost());

        // Add Sugar to the coffee with Milk
        Coffee espressoWithMilkAndSugar = new Sugar(espressoWithMilk);
        System.out.println("Espresso with Milk and Sugar: " + espressoWithMilkAndSugar.getDescription() + " Cost: $" + espressoWithMilkAndSugar.cost());

        // Add Whipped Cream to the base coffee
        Coffee espressoWithWhippedCream = new WhippedCream(espresso);
        System.out.println("Espresso with Whipped Cream: " + espressoWithWhippedCream.getDescription() + " Cost: $" + espressoWithWhippedCream.cost());
    }
}
