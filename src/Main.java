
public class Main {

    public static void main(String[] args) {

        int n = 10;

        processNumber1(n);
        processNumber2(n);
        
        try {
            processNumber3(n); // advertised exceptions need to be handled.
        } catch (OddNumberException | EvenNumberException ex) {
            ex.printStackTrace(System.out);
        }
        // "unchecked": you don't have to catch
        


    }

    public static void processNumber1(int n) {
        if (n % 2 == 1) {
            try {
                // "checked" exception is thrown
                throw new OddNumberException("an odd number is found!");
            } catch (OddNumberException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    public static void processNumber2(int n) {
        if (n % 2 == 0) {
            // "unchecked" exception is thrown
            throw new EvenNumberException("an even number is found!");
        }
    }

    public static void processNumber3(int n) // advertises exceptions
            throws OddNumberException, EvenNumberException {
        if (n % 2 == 0) {
            throw new EvenNumberException("even number");
        } else {
            throw new OddNumberException("odd number");
        }
    }
}
