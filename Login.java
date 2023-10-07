package LoginSignupJava;
import java.util.*;

class Login extends Signup {
    ArrayList<HashMap<String, String>> list = new ArrayList<>();
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    Scanner sc = new Scanner(System.in);

    Login() {
        System.out.println("--------------------------------------------------------------");

        System.out.println("Login..");
        System.out.println("Enter Name");
        map.put("Name", sc.next());
        System.out.println("Enter Email");
        map.put("Email", sc.next());
        System.out.println("Enter Password");
        map.put("Password", sc.next());
        list.add(map);
        System.out.println(list);

        if (Validate().equals("Yes")) {
            System.out.println("user Found...");
            System.out.println(list);
        }

        else {
            System.out.println("no user...");

            System.out.println("Enter to 1 signup ");
            System.out.println("Enter 2 to Home");
            System.out.println("Enter other Number to Exit");

            switch (sc.nextInt()) {
                case 1:
                    Signup signup = new Signup();
                    signup.NewUser();
                    break;
                case 2:
                    // Main mains = new Main();
                    break;
                default:
                    System.exit(0);
                    ;
                    return;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Signup..");
            NewUser();
        }
    }

    public String Validate() {
        if (Main.newUser.contains(map)) {
            return "Yes";
        }
        return "No";
    }

}
