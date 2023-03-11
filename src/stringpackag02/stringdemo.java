package stringpackag02;

public class stringdemo {
    public static void main(String[] args) {
        String str= "Send it to support channel. more java";
        String newstr=str.substring(5);// specifing starting point,prints out from index 5
        System.out.println(newstr);
        System.out.println(str.substring(0,27));// specify start and end points
    }
}
