public class Main {
    public static void main(String[] args) {
        double initial = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        double resultRecursive = FinancialForecast.forecastRecursive(initial, growthRate, years);
        System.out.println("Recursive Result: ₹" + resultRecursive);

        Double[] memo = new Double[years + 1];
        double resultMemoized = FinancialForecast.forecastMemoized(initial, growthRate, years, memo);
        System.out.println("Memoized Result: ₹" + resultMemoized);

        double resultIterative = FinancialForecast.forecastIterative(initial, growthRate, years);
        System.out.println("Iterative Result: ₹" + resultIterative);
    }
}

