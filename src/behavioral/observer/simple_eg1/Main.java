package behavioral.observer.simple_eg1;

/*
Message - getMessage()
Observer - update(Message)
Subject - attach(Observer),detach(Observer), notify(Message)
ConcreteSubject implements Subject
Observer1 implements Observer
Observer2 implements Observer
Observer3 implements Observer
Main
*/
public class Main {
    public static void main(String[] args) {
        // we can also store all these 3 in parent type
        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        Observer3 o3 = new Observer3();

        ConcreteSubject publisher = new ConcreteSubject();
        publisher.attach(o1);
        publisher.attach(o2);

        publisher.notify(new Message("First update"));

        publisher.attach(o3);
        publisher.detach(o2);
        publisher.notify(new Message("Second update"));
    }
}
