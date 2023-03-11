package stringpackage;

public class class04 {
    public static void main(String[] args) {
        String str="    ";
        boolean isEmtpy=str.isEmpty();// it checks string is empty or not
        /*for example
         on the login page if user did not enter anything in the username,
         system prompts please enter username*/
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}

