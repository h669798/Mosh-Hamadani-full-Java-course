package FundamentalsJava;

public class IfStatements {

    public static void main(String[] args) {

        int temp = 21;

        if(temp > 28) {
            System.out.println("It's a hot day!");
            System.out.println("Drink plenty of water!");
        }
        else if (temp > 20)
            System.out.println("It's a beautiful day today!");
        else
            System.out.println("It's a cold day!");


        int income = 500_000;
        String className = income > 550_000 ? "First class" : "Economy class"; /* Using the ternary operator in place of an if-statemnet */
        System.out.println(className);



    }

}
