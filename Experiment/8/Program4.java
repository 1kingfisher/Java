class MyCustomException extends Exception {
    String message;
    MyCustomException(String msg) {
        message = msg;
    }
    void printMessage() {
        System.out.println("Custom Message: " + message);
    }
}

public class Program4 {
    public static void main(String[] args) {
        System.out.println("Devansh Mittal 24csu054");
        try {
            throw new MyCustomException("This is my custom exception message!");
        } 
        catch (MyCustomException e) {
            e.printMessage();
        }
    }
}