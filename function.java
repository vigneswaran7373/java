 class function {
    String name="vicky";
    int id=101;                      //class
    String itdep="full stack";
    int age=18;
     function(){ //constracter
        System.out.println("working constracter succesfully");
    }

    void add(){ //function
        int a=5;
        int b=5;
        System.out.println(a+b);
    }
    void mul(int a,int b){ //function with para meter
       
        System.out.println(a*b);
    }
     static void sub(){ // static function so directly call  static function call static only
        int a=5;
        int b=5;
        System.out.println(a-b);
    }
    int div(){
        int a=60;
        int b=6;
        return a/b;
    }
    void info(){  //function over loading polymorphisam
        System.out.println("hello da");
    }
    void info(int a){  //function over loading or polymorphisam
        System.out.println("hello di");
    }
    public static void main(String args[]){
      function staff1=new function();  //object create  when ever object create constracter call
      System.out.println("staff 1 name :"+staff1.name);
      System.out.println("staff 1 age :"+staff1.age);
      System.out.println("staff 1 domain:"+staff1.itdep);
      staff1.add();//call the function
      staff1.mul(2,3);//call the function with parameter
      System.out.println(staff1.div());// function with return
      sub();//this is static so directly call
      staff1.info();//functon over loading
      staff1.info(23);//functon over loading

    }
}
