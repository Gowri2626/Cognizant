public class FinancialForecast {

    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return (1 + growthRate) * forecastRecursive(initialValue, growthRate, years - 1);
    }

    public static double forecastMemoized(double initialValue, double growthRate, int years, Double[] memo) {
        if (years == 0) {
            return initialValue;
        }
        if (memo[years] != null) {
            return memo[years];
        }
        memo[years] = (1 + growthRate) * forecastMemoized(initialValue, growthRate, years - 1, memo);
        return memo[years];
    }

    public static double forecastIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}


