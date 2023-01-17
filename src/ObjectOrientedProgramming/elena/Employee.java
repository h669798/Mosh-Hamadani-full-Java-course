package ObjectOrientedProgramming.elena;

public class Employee {
    /* Object-variables: */
    private int baseSalary = 0;
    private int hourlyRate = 0;

    /* Constructors: */
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    /* Calculates wage: */
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    /* Sets */
    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be zero or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can not be zero or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
