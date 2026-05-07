package behavioral.observer.simple_eg1;

public class Observer1 implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("observer1: "+ m.getMessage());
    }
}
