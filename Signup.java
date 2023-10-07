package LoginSignupJava;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Signup {
    LinkedHashMap<String, String> UserDetails = new LinkedHashMap<String, String>();

    public void NewUser() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            switch (i) {
                case 0:
                    System.out.println("Eneter Your Name");
                    String name = sc.nextLine();
                    UserDetails.put("Name", name);
                    break;

                case 1:
                    System.out.println("Eneter Your Email");
                    String email = sc.nextLine();
                    UserDetails.put("Email", email);
                    break;

                case 2:
                    System.out.println("Eneter Your Password");
                    String password = sc.nextLine();
                    UserDetails.put("Password", password);

                    break;

                default:
                    System.out.println("Sorry please try again..");
            }
        }
        if (UserDetails.size() == 3) {
        } else {
            System.out.println("Unable to Login....");
            System.out.println("Enter 1 to Try again..");
            int choice = sc.nextInt();
            if (choice == 1) {
                NewUser();
            }
        }
    }

    public LinkedHashMap<String, String> UserDetails() {
        return UserDetails;
    }
}
