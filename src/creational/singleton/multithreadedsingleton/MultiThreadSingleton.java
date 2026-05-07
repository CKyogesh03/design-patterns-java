package creational.singleton.multithreadedsingleton;

public class MultiThreadSingleton {
    public static MultiThreadSingleton instance = null;

    private MultiThreadSingleton(){}

    public static MultiThreadSingleton getInstance(){
        if (instance == null){  // it is possible to enter multiple threads at a time
            synchronized (MultiThreadSingleton.class){ // allow one thread at a time
                if (instance == null){ // helps to prevent creating object again in a multithreaded environment//check the instance is available or not //2nd thread trying to enter the block which is entered along with 1st thread
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}