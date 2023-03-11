package stringpackag02;

public class class02 {
    public static void main(String[] args) {
        String str="Java is not a pain";
        System.out.println(str.indexOf("not"));

        System.out.println(str.indexOf("a"));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+"  "+  "has the index"+ i);



        }
    }
}
