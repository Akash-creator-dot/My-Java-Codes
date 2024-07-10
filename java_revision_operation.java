package com.ascoders;

public class java_revision_operation {
    public static void main(String[] args) {
    //here we perform different types of operations
    String name;
    name=new String("Akash Solanki");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("Ak"));
        System.out.println(name.startsWith("AK"));
        System.out.println(name.endsWith("KI"));
        System.out.println(name.endsWith("ki"));
        System.out.println(name.trim());
        System.out.println(name.replace("a" ,  "k"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('i'));
        System.out.println(name.equals("akash solanki"));
        System.out.println(name.equals("Akash Solanki"));
        System.out.println(name.equalsIgnoreCase("akash solanki"));
        System.out.println(name.equalsIgnoreCase("Akash Solanki"));
}}
