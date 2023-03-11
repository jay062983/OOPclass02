package oop01class;

public class cartester {
    public static void main(String[] args) {
        // create the object of the class
        // here bmw is the name of the object
        car bmw=new car();
        bmw.make= "BMW";
        bmw.model= "i6";
        bmw.year=2023;
        bmw.color="blue";
        bmw.moveforward();
        bmw.applyBrakes();


        car audi = new car();
        audi.model = "E-tron";
        audi.make="Audi";
        audi.year= 2022;
        audi.color="Black";
}}
