import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "Leamsi";
        passwords[0] = "password";

        usernames[1] = "Leamsi2";
        passwords[1] = "password2";

        Scanner scanner = new Scanner(System.in);


        System.out.println("Username:");
        String u = scanner.nextLine();
        System.out.println("Password:");
        String p = scanner.nextLine();


        boolean auth = false;
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p))  {
                auth = true;
            } else {
                System.out.println("Username or password incorrect");
            }
        }

        if (auth) {
            System.out.println("Welcome mr.".concat(u).concat("!"));
        } else {
            System.out.println("You are not auth");
        }
    }
}
