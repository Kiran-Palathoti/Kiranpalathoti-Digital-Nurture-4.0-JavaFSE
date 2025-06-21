import java.util.Scanner;

public class FinancialForecast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter current revenue (in millions): ");
        double currentRevenue = sc.nextDouble();

        
        System.out.print("Enter annual growth rate (%): ");
        double growthRatePercent = sc.nextDouble();
        double growthRate = growthRatePercent / 100;

        
        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        System.out.println("\n📊 Financial Forecast Report");
        System.out.println("----------------------------");

        for (int i = 1; i <= years; i++) {
            double forecast = currentRevenue * Math.pow(1 + growthRate, i);
            System.out.printf("Year %d: %.2f million\n", i, forecast);
        }

        sc.close();
    }
}
