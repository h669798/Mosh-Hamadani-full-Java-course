package ObjectOrientedProgramming;

public class Program {

    /* This whole class is an example of "procedural programming",
    *  aka. a bad way to code. It might look clean, but when you
    *  work with larger scale programming, it will be horrible.
    *  Way to many parameters, fat main method, too many arguments...
    *  very hard to maintain and debug. Lack of re-usability. */
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
        int baseSalary,
        int extraHours,
        int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
