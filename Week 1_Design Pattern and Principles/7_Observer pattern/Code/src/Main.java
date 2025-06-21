public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileApp = new MobileApp("MobileClient");
        Observer webApp = new WebApp("WebClient");

        market.registerObserver(mobileApp);
        market.registerObserver(webApp);

        market.setStockPrice("AAPL", 189.50);
        market.setStockPrice("GOOGL", 2789.75);
    }
}
