public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P001", "Laptop", 10, 75000);
        Product p2 = new Product("P002", "Mouse", 50, 500);
        Product p3 = new Product("P003", "Keyboard", 30, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayAllProducts();

        manager.updateProduct("P002", 45, 450);
        manager.deleteProduct("P003");

        manager.displayAllProducts();
    }
}
