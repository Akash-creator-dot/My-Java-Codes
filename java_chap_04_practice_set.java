package com.ascoders;

public class java_chap_04_practice_set {
    public static void main(String[] args) {
        //Q-1
        /*int a=10;
        if(a==11){
            System.out.println("I'm 11");
        }else{
            System.out.println("I'm not 11");
        }*/
        //Q-2
     /* Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Marks In Mathematics");
        int marks1 =sc.nextInt();
        System.out.println("Please Enter Your Marks In Physics");
        int marks2 =sc.nextInt();
        System.out.println("Please Enter Your Marks In Chemistry");
        int marks3 =sc.nextInt();
        int operation=(marks1+marks2+marks3)/3;
        if(marks1>=33&&marks2>=33&&marks3>=33&&operation>=40){
            System.out.println("Congratulations you're promoted to the next class");
        }else{
            System.out.println("Sorry! try  your luck next time");
        }*/
        //Q-3
       /* System.out.println("Please Enter your Salary in lacks per annum");
        Scanner sc=new Scanner(System.in);
        float income= sc.nextFloat();
        float tax=0;
       if(income<=2.5f){
           System.out.println("Your Tax is");
           tax=tax+0;
       }else if(income>2.5&&income<=5){
           System.out.println("Your Tax is");
           tax = tax+ 0.05f* (income - 2.5f);
       }else if(income>5.0f && income<=10.0f){
           System.out.println("Your Tax is");
           tax=tax +0.05f*(5.0f-2.5f);
           tax=tax +0.2f*(income-5.0f);
       }else if(income>10.0f){
           System.out.println("Your Tax is");
           tax =tax +0.05f*(5.0f-2.5f);
           tax =tax +0.2f*(10.0f-5.0f);
           tax =tax +0.3f*(income-10.0f);
       }float inhand=income-tax;
        System.out.println(tax);
        System.out.println("And your inhand income is");
        System.out.println(inhand);
        }*/
        //Q-4
       /* System.out.println("Please Enter Your Number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch(number) {
            case 1:
                System.out.println("Today the Day is Monday");
                break;
            case 2:
                System.out.println("Today the Day is Tueday");
                break;
            case 3:
                System.out.println("Today the Day is Wednesday");
                break;
            case 4:
                System.out.println("Today the Day is Thrusday");
                break;
            case 5:
                System.out.println("Today the Day is Friday");
                break;
            case 6:
                System.out.println("Today the Day is Saturday");
                break;
            case 7:
                System.out.println("Today the Day is Sunday");
                break;
        }  */
        //Q-5
       /* System.out.println("Please Enter The year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(((year%4)==0) ||((year%4)==0) ||((year%4)==0)){
            System.out.println("This is a Leap year");
        } else{
            System.out.println("This is an Ordinary Year");
        }  */
        //Q-6
       /* System.out.println("Please Enter The Name Of Your Website");
        Scanner sc=new Scanner(System.in);
        String website= sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }else if(website.endsWith(".org")){
            System.out.println("This is an organisation website");
        }*/

    }
}
