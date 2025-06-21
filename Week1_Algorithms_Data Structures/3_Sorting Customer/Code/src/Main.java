public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 2500.0),
            new Order("O002", "Bob", 500.0),
            new Order("O003", "Charlie", 1800.0),
            new Order("O004", "Diana", 3200.0),
            new Order("O005", "Ethan", 1500.0)
        };

        System.out.println("Original Orders:");
        OrderSorter.printOrders(orders);

        System.out.println("\nSorted by Bubble Sort:");
        OrderSorter.bubbleSort(orders);
        OrderSorter.printOrders(orders);

        Order[] orders2 = {
            new Order("O001", "Alice", 2500.0),
            new Order("O002", "Bob", 500.0),
            new Order("O003", "Charlie", 1800.0),
            new Order("O004", "Diana", 3200.0),
            new Order("O005", "Ethan", 1500.0)
        };

        System.out.println("\nSorted by Quick Sort:");
        OrderSorter.quickSort(orders2, 0, orders2.length - 1);
        OrderSorter.printOrders(orders2);
    }
}

