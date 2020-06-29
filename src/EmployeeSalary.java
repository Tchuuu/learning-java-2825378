import java.util.Scanner;

public class EmployeeSalary {

    public static double SalaryCalculator() {
        int weeksPerYear = 52;
        Scanner input = new Scanner(System.in);
        System.out.print("Number of hours the employee works per week ? : ");
        double hoursOfWorks = input.nextDouble();
        while (hoursOfWorks < 0) {
            System.out.println("Number of hours should be a positive value.");
            System.out.print("Number of hours the employee works per week ? : ");
            hoursOfWorks = input.nextDouble();
        }
        System.out.print("Amount of money the employee makes per hour ? : ");
        double moneyPerHours = input.nextDouble();
        while (moneyPerHours < 0) {
            System.out.println("Amount of money should be a positive value.");
            System.out.print("Amount of money the employee makes per hour ? : ");
            moneyPerHours = input.nextDouble();
        }
        System.out.print("Number of vacation days per year ? : ");
        int vacationDays = input.nextInt();
        while (vacationDays < 0) {
            System.out.println("Number of vacation days should be a positive value.");
            System.out.print("Number of vacation days per year ? : ");
            vacationDays = input.nextInt();
        }
        int hoursUnpaid = 8;
        double unpaidTime = vacationDays * hoursUnpaid * moneyPerHours;
        double annualSalary = hoursOfWorks * moneyPerHours * weeksPerYear - unpaidTime;
        return annualSalary;
    }

    public static void main(String[] args) {
        double output = SalaryCalculator();
        System.out.println("The employee salary is $ " + output);

    }
}
