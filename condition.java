import java.util.Scanner;
class condition {
    public static void main(String args[]){
        Scanner come=new Scanner(System.in);
        System.out.println("enter the num 1");
        int num1=come.nextInt();
        System.out.println("enter the num 2");
        int num2=come.nextInt();
        System.out.println("enter the num 3");
         int num3=come.nextInt();
        System.out.println("the num 1 is"+num1);
        System.out.println("the num 2 is"+num2);
        System.out.println("the num 3 is"+num3);
        // if else if else
        if(num1<num2){
            System.out.println("num 2 is big");
        }
        else if(num2<num3 && num1>num3){
                System.out.println("num 1 and  is big");
        }
        else{
            System.out.println("num 3 is big");
        }
//nested if
        if(num1>=num2 && num1>=num3){
            if(num1==num3){
                System.out.println("num1 and num3 are same");
            }
            else{
                System.out.println("num1 and num3 are not same");
            }
        }
        else{
            System.out.println("not full fill the condition");
        }
  //switch case
     System.out.println("enter the number");
    int k=come.nextInt();
    switch (k){
        case 1:
            System.out.println("your are bad person");
            break;
        case 2:
            System.out.println("your are good person");
            break;
        default:
                 System.out.println("out of range");
    }

}
}


