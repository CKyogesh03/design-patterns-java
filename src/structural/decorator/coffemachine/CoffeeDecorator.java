package structural.decorator.coffemachine;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee; // MilkDecorator,SugarDecorator

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
