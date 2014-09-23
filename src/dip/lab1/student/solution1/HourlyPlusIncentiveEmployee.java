package dip.lab1.student.solution1;

/**
 * Created by Timothy on 9/23/2014.
 */
public class HourlyPlusIncentiveEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    private double incentive;

    public HourlyPlusIncentiveEmployee(double hourlyRate, double totalHrsForYear, double incentive) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
        setIncentive(incentive);
    }

    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 1000) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public void setIncentive(double incentive) {
        if(incentive < 0 || incentive > 500) {
            throw new IllegalArgumentException();
        }
        this.incentive = incentive;
    }

    public double getIncentive() {
        return this.incentive;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 4000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }
}
