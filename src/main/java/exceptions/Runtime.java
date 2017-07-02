package exceptions;

/**
 * Some Description
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
