package com.ascoders;
 import java.util.Scanner;
public class java_chap_01_practice_set {
    public static void main(String[] args) {
        //Q-1
        //Sum of five numbers in java
        /* float num1=13.0f;
        float num2=23.0f;
        float num3=33.0f;
        float num4=43.0f;
        float num5=53.0f;
        float sum=num1+num2+num3+num4+num5;
        System.out.println("Sum of your numbers");
        System.out.println(sum);*/

        //Q-2
        //Calculate CGPA of a Student
       /* Scanner sc=new Scanner(System.in);
        System.out.println("please enter your marks in: Physics");
        float mark1=sc.nextFloat();
        System.out.println("please enter your marks in: Mathematics");
        float mark2=sc.nextFloat();
        System.out.println("please enter your marks in: Chemistry");
        float mark3=sc.nextFloat();
        float operation=(mark1+mark2+mark3)/3000*100;
        System.out.println("Your CGPA is: ");
        System.out.println(operation);  */

        //Q-3
        //Greets a user
      /*  System.out.println("Please enter your good name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hi "+name+" Have a Good Day");*/

        //Q-4
        //Conversion of Kilometer To Miles
       /* System.out.println("Please Enter Length In Kilometer");
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        float operation =length*621/1000;
        System.out.println("And the calculated length is");
        System.out.println(operation);*/
        //or
        /*System.out.println("Please Enter the length which you want to convert");
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        System.out.println("Please Enter the parameter of that length");
        String parameter=sc.next();
        switch(parameter){
            case "kilometer":
                System.out.println("Your conversion of kilometer to miles is:");
                System.out.println(length*0.621);
                break;

            case "miles":
                System.out.println("Your conversion of miles to kilometer is:");
                System.out.println(length*1.610);
                break;
        }
    }*/

        //Q-5
        //Detect Entered number is an integer or not
       /* System.out.println("Please enter your number to find the entered number is an integer or not");
        Scanner sc=new Scanner(System.in);
        boolean num= sc.hasNextInt();
        System.out.println(num);*/
    }
}
