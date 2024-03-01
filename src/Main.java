import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        choose();
    }
    public static void choose(){
        Scanner choose_LR = new Scanner(System.in);
        System.out.println("Don't have an account? or you have account ? \n Digit [L] for login or [R] to register ");
        String choose_L_or_R = choose_LR.nextLine();
        try
        {
            if (choose_L_or_R.equals("L")) {
                login();
            } else if (choose_L_or_R.equals("R")) {
                register();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void login(){
        login_message();

        Scanner email = new Scanner(System.in);
        System.out.print("Email: ");
        String eMAIL = email.nextLine();

        Scanner password = new Scanner(System.in);
        System.out.print("Password: ");
        String passWord = password.nextLine();
    }

    public static void login_message(){
        System.out.println("*-----* Login *-----*");
    }

    public static void register() {
        register_message();
        Scanner name = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = name.nextLine();

        ArrayList<String> list_emails = new ArrayList<>();
        Scanner email = new Scanner(System.in);
        System.out.print("Email: ");
        String eMAIL = email.nextLine();
        list_emails.add(eMAIL);


        ArrayList<String> list_passwords = new ArrayList<>();
        Scanner password = new Scanner(System.in);
        System.out.print("Password: ");
        String passWord = password.nextLine();
        list_passwords.add(passWord);


        Scanner city = new Scanner(System.in);
        System.out.print("City : ");
        String ciTy = city.nextLine();
        ArrayList<String> list_citys = new ArrayList<>();

    }

    public static void register_message(){
        System.out.println("*-----* Sign Up *-----*");
    }
}
