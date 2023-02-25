package utility.logging;

public class EmailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Emaile loglandı: " + data);        
    }
}
