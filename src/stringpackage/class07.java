package stringpackage;

public class class07 {
    public static void main(String[] args) {
        String  str= "I love morning";
        boolean startswith=str.startsWith("I");
        /* finds out if the string starts with letter or word I
        System.out.println(startswith); output is boolean*/
        System.out.println(str.endsWith("morning"));
    /* finds out if the string ends with word or letter*/
        System.out.println(str.toLowerCase().startsWith("i"));
   /*Method chaining is when multiple methods are called on the same line
   * only those methods can be chained which returns a String*/

        System.out.println(str.contains("love"));
        // finds out if the word is present
    }
}
