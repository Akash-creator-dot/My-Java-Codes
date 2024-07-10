package com.ascoders;

public class java_chap_03 {
    public static void main(String[] args) {
        String name;
        name=new String("Akash Solanki");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(name.startsWith("Ak"));
        System.out.println(name.endsWith("ki"));
        System.out.println(name.replace('a','s'));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("as"));
        System.out.println(name.indexOf("as",1));
        System.out.println(name.lastIndexOf('k'));
        System.out.println(name.lastIndexOf('a',4));
        System.out.println(name.equals("Akash Solanki"));
        System.out.println(name.equalsIgnoreCase("akash solanki"));
    }
}
