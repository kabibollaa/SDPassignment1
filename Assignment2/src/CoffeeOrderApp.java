import java.util.Scanner;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOrdering = true;

        while (continueOrdering) {
            System.out.println("Choose a coffee type:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            int coffeeChoice = scanner.nextInt();

            Coffee coffee = null;
            switch (coffeeChoice) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Latte();
                    break;
                default:
                    System.out.println("Invalid coffee choice. Please try again.");
                    continue;
            }

            while (true) {
                System.out.println("Add condiments/options:");
                System.out.println("1. Milk");
                System.out.println("2. Sugar");
                System.out.println("3. Whipped Cream");
                System.out.println("4. Finish and display order");
                int condimentChoice = scanner.nextInt();

                switch (condimentChoice) {
                    case 1:
                        coffee = new Milk(coffee);
                        break;
                    case 2:
                        coffee = new Sugar(coffee);
                        break;
                    case 3:
                        coffee = new WhippedCream(coffee);
                        break;
                    case 4:
                        continueOrdering = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                if (!continueOrdering || condimentChoice == 4) {
                    break;
                }
            }

            if (coffee != null) {
                System.out.println("Your coffee order: " + coffee.getDescription());
                System.out.println("Total cost: $" + coffee.cost());
            }

            System.out.println("Do you want to place another order? (yes/no)");
            String anotherOrder = scanner.next().toLowerCase();
            if (!anotherOrder.equals("yes")) {
                continueOrdering = false;
            }
        }

        System.out.println("Thank you for ordering!");
        scanner.close();
    }
}
