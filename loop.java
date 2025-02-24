import java.util.Scanner;
class loop{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            System.out.println(i+" vicky"); //for loop
        }
                Scanner come=new Scanner(System.in);
                int a=come.nextInt();
                int b=come.nextInt();
                for(int i=a;i<=b;i++){
                    System.out.println(i);
                }
               int evencount=0;
                for(int i=1;i<=10;i++){
                    if(i%2==0){
                        System.out.println("even number "+i);
                        evencount=evencount+1;
                    }
                      
                }
                System.out.println("eventcount "+evencount);

                for(int i=1;i<=3;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }                                      //nested for loop
                     System.out.println();
                }
                int count=1;
                do{
                    System.out.println("enter the number grather than 5");
                    count=come.nextInt();
                }while(count<5);

                  int arr[]={23,45,67,54,32};
                  for(int var:arr){                 //for each method or enhanced for loop
                    System.out.println(var);
                  } 

                int c=3;
                while (c==3){                               //while loop
                    System.out.println("vw world");
                }
    }
}