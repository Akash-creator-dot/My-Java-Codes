package com.ascoders;
import java.util.Scanner;
public class java_chap_04 {
    public static void main(String[] args) {
        //Whether the boy can drive or not
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("please Enter Your Age");
        byte age= sc.nextByte();
        if(age>18){
            System.out.println("Yes boy you can drive!");
        }else{
            System.out.println("No! boy you cannot drive");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        byte age = sc.nextByte();
        switch (age) {
            case 18:
                System.out.println("You're not job ready!");
                break;
            case 24:
                System.out.println("You're not an experience faculty!");
                break;
            case 35:
                System.out.println("You're a semi-experience faculty!");
                break;
            case 45:
                System.out.println("You're an experience faculty!");
                break;
            case 55:
                System.out.println("You're ready for retirement!");
                break;
            default:

            System.out.println("you should enjoy your life");
        }
    }
}
