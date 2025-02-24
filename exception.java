// exception handling
import java.util.Scanner;

class NotvalidException extends Exception {
    public NotvalidException(String s) {
        super(s);
    }
}

class exception {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter your age"); //our code give this block
            int age = input.nextInt();

            if (age < 1) {
                throw new ArithmeticException("Age should be greater than 1"); // Manually throw exception
            }

            // The following line was unreachable, so it's moved inside the if condition properly
            throw new NotvalidException("Mismatch error"); // Manually throw exception
        } 
        catch (NotvalidException n) { 
            System.out.println(n);
        } 
        catch (Exception e) { // catch block run if only find errors only
            System.out.println(e);
        } 
        finally { //error come or not print 
            System.out.println("Code complete");
           
        }
    }
}
