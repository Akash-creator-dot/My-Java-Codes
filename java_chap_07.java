package com.ascoders;

public class java_chap_07 {
   /* static int logic(int x,int y){
        int z;
    if(x>y){
        z=x+y;
    }else{
        z=(x+y)*5;
    }
    return z;
}
    public static void main(String[] args) {
     int a=5;
     int b=7;
     int c;
     c=logic(a,b);
     int a1=7;
     int b1=4;
     int c1;
     c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }*/
    //object create and then call the method
   /* int logic(int x,int y){
       int z;
       if(x>y){
           z=x+y;
       }else{
           z=(x+y)*5;
       }
       return z;
   }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        java_chap_07 obj=new java_chap_07();
        c=obj.logic(a,b);
        int a1=7;
        int b1=4;
        int c1;
        c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}*/
/*static void telljoke(){
    System.out.println("A ham sandwich walks into a bar and orders a beer, bartender says “sorry, we don’t serve food here.”");}

    public static void main(String[] args) {
        telljoke();
    }*/
    /*static void change(int [] arr){
        arr[0]=98;
    }public static void main(String[] main){
        int [] marks={99,97,96,95,94};
        change(marks);
        System.out.println(marks[0]);
    }*/
    static void foo(){
        System.out.println("Good Morning Bro!");
    }static void foo(int a){
        System.out.println("Good Morning " +a+" bro!");
    }static void foo(int a,int b){
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }public static void main(String[] main){
        foo();
        foo(3000);
        foo(3000,4000);
    }
}

