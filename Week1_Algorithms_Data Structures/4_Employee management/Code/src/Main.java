public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E001", "Alice", "Developer", 60000));
        manager.addEmployee(new Employee("E002", "Bob", "Designer", 55000));
        manager.addEmployee(new Employee("E003", "Charlie", "Manager", 75000));

        System.out.println("All Employees:");
        manager.displayAllEmployees();

        System.out.println("\nSearching for E002:");
        Employee found = manager.searchEmployee("E002");
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDeleting E001:");
        manager.deleteEmployee("E001");
        manager.displayAllEmployees();
    }
}

