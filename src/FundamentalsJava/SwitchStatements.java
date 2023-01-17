package FundamentalsJava;

public class SwitchStatements {

    public static void main(String[] args) {

        String role = "admin";

        /* Using an if-statement as a solution: */
        if(role == "admin")
            System.out.println("You're an admin!");
        else if (role == "moderator")
            System.out.println("You're a moderator!");
        else
            System.out.println("You're a user!");


        /* Using a switch-statement as a solution: */
        switch(role) {
            case "admin":
                System.out.println("You're an admin!");
                break;

            case "moderator":
                System.out.println("You're a moderator!");
                break;

            default:
                System.out.println("You're a user!");
        }
    }

}
