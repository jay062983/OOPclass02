package stringpackage;

public class class05 {
    public static void main(String[] args) {
        //if these two string are equal or not
        String str="Java";
        String  str2="Java";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);
        String str3= "JAVA";
        String str4="java";
      //  boolean areEqual1=str.equals(str4);
        //System.out.println(areEqual1);
        boolean areEqual4=str.equalsIgnoreCase(str4);
        System.out.println(areEqual4);
    }
}
