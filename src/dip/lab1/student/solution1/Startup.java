package dip.lab1.student.solution1;

/**
 * Created by Timothy on 9/23/2014.
 */
public class Startup {
    public static void main(String[] args) {
        Employee john = new HourlyPlusIncentiveEmployee(16.50, 1020, 300);
        Employee jane = new SalariedEmployee(60000, 1550);
        Employee bob = new SalariedEmployee(55000,750);

        Employee[] employees = {jane, john, bob};

        HRService hr = new HRService();

        for(int i=0; i < employees.length; i++) {
            System.out.println("Compensation:" + hr.getAnnualCompensationForEmployee(employees[i]));
        }
    }
}
