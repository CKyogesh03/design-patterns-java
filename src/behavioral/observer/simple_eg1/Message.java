package behavioral.observer.simple_eg1;

public class Message {
    private String message;
    Message(String message){
        this.message = message;
    }
    String getMessage(){
        return this.message;
    }
}
