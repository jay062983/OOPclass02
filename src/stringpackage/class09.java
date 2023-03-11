package stringpackage;

import java.util.Scanner;
/*
@hereStore username, password and confirm password from a user and check following requirements:
username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”*/
public class class09 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter you username");
        String username=scan.next();
        System.out.println("please enter your password");
        String password=scan.next();
        System.out.println("Please enter your password again");
        String confirmpassword= scan.next();
        if(username.isEmpty()||password.isEmpty()) {
            System.out.println("Username or password cannot be empty");
        }else if (password.length()<8) {
            System.out.println("password is too short");
        }else if(password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if(password.equals(confirmpassword)) {
            System.out.println("password does not match");
        }else{
            System.out.println("your username and password has been created");

            }
        }
    }

