package ObjectOrientedProgramming.RefactoredMortageCalculatior;

public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 10_000, 10_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years  = (byte) Console.readNumber("Downpayment period (years): ", 1, 30);

        var calculator = new Calculations(principal, annualInterest, years);
        var report = new PrintOut(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}