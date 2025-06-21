public class TaskLinkedList {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteTask(String taskId) {
        TaskNode current = head, prev = null;

        while (current != null && !current.task.getTaskId().equals(taskId)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
            return;
        }

        if (prev == null) {
            head = head.next;
        } else {
            prev.next = current.next;
        }

        System.out.println("Task deleted.");
    }

    public void displayTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
