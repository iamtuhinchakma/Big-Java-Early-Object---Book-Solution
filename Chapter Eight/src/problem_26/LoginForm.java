package problem_26;

public class LoginForm {
    private String actualUserName = "";
    private String actualPassword ="";
    private String enteredUserName ="";
    private String enteredPassword ="";
    private boolean loggedIn = false;

    public LoginForm(String userName, String password){
        this.actualPassword = password;
        this.actualUserName = userName;
    }
    public void input(String text, String input){
        if(text.equals("Username")){
            enteredUserName = input;
        } else if (text.equals("Password")) {
            enteredPassword = input;
        } else {
            System.out.println("Something went Wrong!");
        }
    }
    public void click(String button){
        if(button.equals("Submit")){
            if(enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword)){
                loggedIn = true;
            } else {
                loggedIn = false;
            }
        } else if (button.equals("Reset")) {
            enteredUserName = "";
            enteredPassword = "";
        } else {
            System.out.println("Something went Wrong!");
        }
    }
    public boolean isLoggedIn(){
        return loggedIn;
    }
}
