package FundamentalsJava;

public class Methods {

    public static void main(String[] args) {

        greetUser("Elena", "Victoria");
        String message = greetUser2("Elena", "Victoria");
        System.out.println(message);

    }

    public static void greetUser(String firstName, String lastName) {

        System.out.println("Hello, " + firstName + " and " + lastName + "!");

    }

    public static String greetUser2(String firstName, String lastName) {

        return "Hello, " + firstName + " and " + lastName + "!";

    }

}
