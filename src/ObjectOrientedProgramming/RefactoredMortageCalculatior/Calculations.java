package ObjectOrientedProgramming.RefactoredMortageCalculatior;

public class Calculations {

    /* Constants */
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    /* Variables, declaration */
    private int principal;
    private float annualInterest;
    private byte years;

    /* Constructors */
    public Calculations(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    /* Method for calculating total mortage */
    public double calculateMortage() {
        float convertedInterestRate = getConvertedInterestRate();
        short monthlyPayment = getMonthlyPayment();
        double mortage = principal
                * (convertedInterestRate * Math.pow(1 + convertedInterestRate, monthlyPayment))
                / (Math.pow(1 + convertedInterestRate, monthlyPayment) - 1);

        return mortage;
    }

    /* Method for calculating what's left to pay */
    public double calculateBalance(
            short paymentsMade) {
        float convertedInterestRate = getConvertedInterestRate();
        short monthlyPayment = getMonthlyPayment();

        double balance = principal
                * (Math.pow(1 + convertedInterestRate, monthlyPayment) - Math.pow(1 + convertedInterestRate, paymentsMade))
                / (Math.pow(1 + convertedInterestRate, monthlyPayment) - 1);

        return balance;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getMonthlyPayment()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    private short getMonthlyPayment() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getConvertedInterestRate() {
        return (annualInterest / PERCENT) / MONTHS_IN_YEAR;
    }

}
