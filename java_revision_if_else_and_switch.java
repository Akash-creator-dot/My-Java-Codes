package com.ascoders;
import java.util.Scanner;
public class java_revision_if_else_and_switch {
    public static void main(String[] args) {
       /* System.out.println("Please Enter Your Age To Know Whether You Are Allow For Drive Or Not");
       Scanner sc=new Scanner(System.in);
       int age=sc.nextInt();
       if(age<18){
           System.out.println("No! Boy You Cannot Drive");
       }else{
           System.out.println("Yes! Boy You Can Drive");
       }*/
        System.out.println("please Enter your lucky number to know how lucky you are");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch(number){
            case 1:
                System.out.println("You Are in one percents");
                break;
            case 2:
                System.out.println("You are God gifted");
                break;
            case 3 :
                System.out.println("Sorry! but you need to more efforts than others");
                break;
                case 4:
                    System.out.println("Your are so! lucky");
            case 5:
                System.out.println("You Are In Top Point percent");
                    break;
            default:
                System.out.println("It will Tell You In The Future");
        }
    }
}
