public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task("T001", "Design Database", "Pending"));
        taskList.addTask(new Task("T002", "Write API", "In Progress"));
        taskList.addTask(new Task("T003", "Test Application", "Pending"));

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for T002:");
        Task found = taskList.searchTask("T002");
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting T001:");
        taskList.deleteTask("T001");

        System.out.println("\nAll Tasks After Deletion:");
        taskList.displayTasks();
    }
}

