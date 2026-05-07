package creational.singleton.threadprobleminsingleton;


public class Person extends Thread {

    @Override
    public void run() {
        System.out.println(OfficeKey.getInstance());
    }

    public static void main(String[] args) {
        int numThreads = 10; // Number of threads to create

        // Create and start multiple threads
        for (int i = 0; i < numThreads; i++) {
            new Person().start();
        }
    }
}