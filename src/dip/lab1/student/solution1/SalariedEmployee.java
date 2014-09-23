package dip.lab1.student.solution1;

/**
 * Created by Timothy on 9/18/2014.
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }



    @Override
    public double getAnnualWages() {
        return annualBonus + annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }
}
