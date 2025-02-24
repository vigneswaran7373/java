import java.util.Scanner;
class vw2 {
    public static void main(String args[]){
        Scanner va=new Scanner(System.in);
        String name=va.nextLine();
        float mark=va.nextInt();
        System.out.println("enter the number 1 and number 2 values");
        int num1=va.nextInt();
        int num2=va.nextInt();
        System.out.println(num1>=num2?"num1 is big":"num2 is big"); //ternery operator
        va.nextLine();
        String dep=va.nextLine();
        System.out.println(" my name is "+name);
        System.out.println("my mark is "+mark/10 +"/10");
        System.out.println("my department is "+dep);
    }
}