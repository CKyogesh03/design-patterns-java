//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number & 1);
        boolean isEven = (number & 1) == 0;
        System.out.println(isEven);
    }
}