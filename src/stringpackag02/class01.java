package stringpackag02;

public class class01 {
    public static void main(String[] args) {
        String str="jklafjdi 234145r45 !@@#*";
       int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                counter++;
        }
        }
        System.out.println("total isAlphabetic in str" +"  "+ counter);
    }
}
