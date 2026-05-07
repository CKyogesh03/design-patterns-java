package structural.decorator.color;

public class Demo {
    public static void main(String[] args){

        Color black = new Black();
        Color pattern = new PatternDecorator(new Black());

        System.out.println("\nStyle: Solid");
        black.fill();

        System.out.println("\nStyle: Pattern");
        pattern.fill();
    }
}
