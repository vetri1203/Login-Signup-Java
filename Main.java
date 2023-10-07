package LoginSignupJava;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    static ArrayList<LinkedHashMap<String, String>> newUser = new ArrayList<LinkedHashMap<String, String>>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scanner scu = new Scanner(System.in);
        boolean condition = true;
        int choice = 0;
        while (condition) {
            System.out.println("Enter 1 to Login");
            System.out.println("Enter 2 to Signup");
            System.out.println("Enter 3 to exit");
            System.out.println("--------------------------------------------------------------");

            System.out.println("Enter the correct Number..");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("You Select Login");
                    Login obj = new Login();
                    break;
                case 2:
                    System.out.println("You Select Signup");
                    Signup signup = new Signup();
                    signup.NewUser();
                    newUser.add(signup.UserDetails());
                    break;

                case 4:
                    System.out.println(newUser);
                    break;

                case 3:
                    System.out.println("Thank you...");
                    condition = false;
                    break;

                default:
                    System.out.println("sorry Enter the correct Number");
                    condition = true;
            }
        }

        sc.close();
    }
}
