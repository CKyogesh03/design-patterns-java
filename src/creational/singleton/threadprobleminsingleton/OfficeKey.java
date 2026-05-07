package creational.singleton.threadprobleminsingleton;


public class OfficeKey {
    private static OfficeKey instance;

    private OfficeKey() {}

    //it is possible to enter multiple threads at the same time - run the program multiple time to make this happen
    public static OfficeKey getInstance() {
        if (instance == null) {
//            makeTheThreadToWaitManually(); // use this method to make multiple threads to access the getInstance method concurrently
            instance = new OfficeKey();
        }
        return instance;
    }
    //====================================================================================
    public static void makeTheThreadToWaitManually(){
        //note: without sleep method also some time 2nd object is created parallelly - check this by running the code
        //            //no need this sleeping time so just run without this lines of code
        try {
            // Introduce a delay to simulate concurrent access
            Thread.sleep(1); // Adjust delay as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}