import java.util.Scanner;
public class Main {

    public static String[] getCredentials() {
        Scanner s = new Scanner(System.in);
        String[] info = new String[4];
        System.out.println("Please enter your first name");
        String firstName = s.nextLine();
        info[0] = firstName;
        System.out.println("Please enter your last name");
        String lastName = s.nextLine();
        info[1] = lastName;
        System.out.println("Please enter your DOB in this 'MM/DD/YYYY'");
        String dob = s.nextLine();
        info[2] = dob;
        System.out.println("Please enter your email");
        String email = s.nextLine();
        info[3] = email;
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
        s.close();
        return info;
    }

    public static void main(String[] args) {
        String[] info;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Roshan's password manager- Please type in 'login' to login to your account or 'create' to create a new account ");
        String entry = sc.nextLine();
        if (entry.equals("create")) {
            info = getCredentials();
        } else if (entry.equals("login")) {
            System.out.println("Login function here");
        } else {
            while (!entry.equals("login") && !entry.equals("create")) {
                System.out.println("Please enter 'login' or 'create' ");
                entry = sc.nextLine();
            }
        }
    }
}