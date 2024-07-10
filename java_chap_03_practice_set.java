package com.ascoders;
import java.util.Scanner;
public class java_chap_03_practice_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       //Q-1
        //toLowerCase
       /* System.out.println("Please Enter Your Good Name");
        String name=sc.next();
        System.out.println(name.toLowerCase());*/
        //Q-2
        //spaces<=>underscore
        /*String name="Akash Solanki";
        System.out.println(name.replace(' ','_'));*/
        //Q-3
        //name in new sentence
        /*String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>","Akash");
        System.out.println(letter);*/
      //Q-4
      /*  System.out.println("This will identify'  ' or'   ' Spaces");
        String name="A  k  as   h So    lank   i";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
        System.out.println(name);*/
        //Q-5
        // greet to yourself
      /*  String Appreciation="Dear,\n\t\tAkash Solanki\n\n\t\t\t\tYour Learning speed \n\t\t\t\t\t\tis just osm!";
        System.out.println(Appreciation);*/
    }
}
