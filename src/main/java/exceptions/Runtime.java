package exceptions;

/**
 * This is a prove that a RuntimeException get catched
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Runtime {

    public static void main(String[] args) {
        try {
            throw new RuntimeException("Bang");
        } catch (Exception e) {
            System.out.println("I caught: " + e);
        }
    }

}
