import java.util.Scanner;
import java.util.Random;
class array{
    public static void main(String args[]){
        String[] vw = {"vicky","vidhya","suba"}; // method 1 inbulid array syntax
        System.out.println(vw[2]);

       String[] fruite=new String[3]; //method 2
       fruite[0]="apple";
       fruite[1]="bannana";
       fruite[2]="goa";
       System.out.println(fruite[1]);
       System.out.println(fruite[2]);
       System.out.println(fruite[0]);
      Scanner come=new Scanner(System.in);
      System.out.println("enter the array value in number");
       int[] num=new int[5];
       num[0]=come.nextInt();
       num[1]=come.nextInt();
       num[2]=come.nextInt();
       num[3]=come.nextInt();
       num[4]=come.nextInt();
       System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);

       int[] mark=new int[5];
       System.out.println("enter the mark value in number");
       for(int i=1;i<=4;i++){
       mark[i]=come.nextInt(); // loop throw the array
       }
       for(int i=1;i<=4;i++){
        System.out.println(mark[i]);
       }
       Random ran=new Random();
       int guessno=ran.nextInt(5);
       System.out.println("random no"+guessno);

        int[][] matrix = new int[5][2];

        matrix[0][0] = 1;               //2d array
        matrix[0][1] = 2;
        matrix[4][0] = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

    
