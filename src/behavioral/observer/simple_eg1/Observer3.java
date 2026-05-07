package behavioral.observer.simple_eg1;

public class Observer3 implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("observer3: "+ m.getMessage());
    }
}
