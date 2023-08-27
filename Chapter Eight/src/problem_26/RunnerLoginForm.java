package problem_26;

import java.util.Scanner;

public class RunnerLoginForm {
    public static void main(String[] args)
    {
        LoginForm form = new LoginForm("mayuresh_95", "LoveCoding_95");
        Scanner in = new Scanner(System.in);

        while(!form.isLoggedIn())
        {
            System.out.println("Login Form");

            System.out.print("Enter Username: ");
            String userName = in.next();
            form.input("Username", userName);

            System.out.print("Enter Password: ");
            String password = in.next();
            form.input("Password", password);
            form.click("Submit");
        }
        System.out.println("Logged in Successfully!");

        in.close();
    }
}
