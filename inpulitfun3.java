 class v1{
    int num1;
    int num2;
    int num3;
    void assign(int num1, int num2,int a){
        this.num1=num1; //this key word use point instance variable that means current class global  variable 
         this.num2=num2;
         num3=a;//local variable this a no use this
    }
    void display(){
   System.out.println("num1: "+num1);
   System.out.println("num2: "+num2);
    }
}
class inpulitfun3{
    public static void main(String args[]){
      v1 i1=new v1();
      v2 i2=new v2();
      i1.assign(8, 6,7);
      i1.display();
      System.out.println(i2.getage());
      i2.setage(18);


    }
}
    class v2{
        private int age=25;//private variable only use this class only

        public int getage()//get use value get panna
        {
            return age;
        }
        public void setage(int age){  //set use value change it
            System.out.println("valus is  change: " +age);
          this.age=age;
        }
    }

