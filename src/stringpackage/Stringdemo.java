package stringpackage;

public class Stringdemo {
    public static void main(String[] args) {
        //creating an object of the String class
        String strobj=new String("Java");
        //another way of creating an object of string class a shorter way
        //mostrly this is how we create the object of String class
        String strobj2="java";
        System.out.println(strobj2.length());
        String str="Apple ";
        int len=str.length();
        System.out.println(len);
        String name="Johndavidnjoojuu";
        if(name.length()>10){
            System.out.println("Name shall not be more than 10 charecters");
        }

    }
}
