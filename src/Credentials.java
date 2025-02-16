import java.util.Scanner;

public class Credentials {

    public  String[] getNewCredentials(){
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
        return info;
    }
}
