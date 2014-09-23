package dip.lab1.student.solution1;

/**
 * Created by Timothy on 9/18/2014.
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public void setHourlyRate(double hr) {
        if(hr < 0 || hr > 1000) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hr;
    }
    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 4000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
    public double getTotalHrsForYear() {
        return this.totalHrsForYear;
    }
    public double getHourlyRate() {
        return this.hourlyRate;
    }

    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
}
