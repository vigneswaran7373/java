//factorial
import java.util.Scanner;

public class inbulitfun2 {
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String s=Integer.toString(55);//data type change
        System.out.println("integer convert into string :"+s);
         String s1=Integer.toBinaryString(14);//data type change
        System.out.println("integer convert into binarys :"+s1);
         String s3=Integer.toOctalString(14);//data type change
        System.out.println("integer convert into octal :"+s3);
         String s4=Integer.toHexString(14);//data type change
        System.out.println("integer convert into hexa :"+s4);
        int y=Integer.valueOf(s);//return premetive data type //data type change
        System.out.println("string convert into int :"+y);
        int b=Integer.valueOf(s); //return object  //data type change
        System.out.println("string convert into int :"+b);
        String name="vicky";
        System.out.println(s.equals("hi"));// string equal
        System.out.println(name.charAt(3));//specific character get
       
System.out.println(((Object) s1).getClass().getSimpleName());  // find data type in premtive only

        scanner.close();
        
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
