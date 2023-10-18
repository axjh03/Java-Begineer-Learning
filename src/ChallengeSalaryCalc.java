import java.util.Scanner;
public class ChallengeSalaryCalc {
    public static double TotalSalary(double HourPerWeek, double HourlyPay){
        return HourlyPay*HourPerWeek*4*12;
    }
    public static void main(String[] args){
        double worksPerWeek, HourlyMoney;
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours you work per week? ");
        worksPerWeek = input.nextDouble();

        System.out.println("Hourly wage? ");
        HourlyMoney = input.nextDouble();

        double sal = TotalSalary(worksPerWeek, HourlyMoney);
        System.out.println("Your Yearly salary : "+sal);
    }
}
