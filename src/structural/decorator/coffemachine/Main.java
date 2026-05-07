package structural.decorator.coffemachine;


/*
Coffee(i)
PlainCoffee(c) implements Coffee
CoffeeDecorator(c) implements Coffee
MilkDecorator(c) extends CoffeeDecorator
SugarDecorator(c) extends CoffeeDecorator

note:
follows open closed principle
 */
public class Main {
    public static void main(String[] args) {
        // Plain Coffee
        Coffee coffee = new PlainCoffee();
        System.out.println("Description: " + coffee.getDescription()); // Description: Plain Coffee
        System.out.println("Cost: $" + coffee.getCost()); // Cost: $2.0

        // Coffee with Milk
        Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println("\nDescription: " + milkCoffee.getDescription()); // Description: Plain Coffee, Milk
        System.out.println("Cost: $" + milkCoffee.getCost()); // Cost: $2.5

        // Coffee with Sugar and Milk
        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription()); // Description: Plain Coffee, Milk, Sugar
        System.out.println("Cost: $" + sugarMilkCoffee.getCost()); // Cost: $2.7
    }
}
