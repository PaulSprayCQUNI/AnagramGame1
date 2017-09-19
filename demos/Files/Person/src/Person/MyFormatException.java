import java.io.*;
public class MyFormatException extends IOException {
    public MyFormatException(){
    }
    public MyFormatException(String message) {
        super("Something wrong " + message);
    }
}