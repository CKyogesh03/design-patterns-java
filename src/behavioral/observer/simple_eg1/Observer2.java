package behavioral.observer.simple_eg1;

public class Observer2 implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("observer2: "+ m.getMessage());
    }
}
