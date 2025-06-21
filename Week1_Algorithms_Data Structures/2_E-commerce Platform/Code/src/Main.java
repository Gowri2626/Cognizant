public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Mouse", "Accessories"),
            new Product("P003", "Keyboard", "Accessories"),
            new Product("P004", "Monitor", "Electronics"),
            new Product("P005", "Charger", "Electronics")
        };

        Product foundLinear = SearchEngine.linearSearch(products, "Keyboard");
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        Product foundBinary = SearchEngine.binarySearch(products, "Keyboard");
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}

