import java.util.ArrayList;

public class TaskCreator {
    
    private ArrayList<Task> tasks;
    
    public TaskCreator() {
        tasks = new ArrayList<>();
    }

    // method adds a task, taking a string parameter and then just pushing it to the array
    public void addTask(String task, int priority) {
        tasks.add(new Task(task, priority));
    }
    
    public void addTask(String task) {
        tasks.add(new Task(task ));
    }
    
    // method removes a task
    public void removeTask(String name) {
        for (int index = tasks.size() - 1; index >= 0; index--) {
            if (tasks.get(index).getTaskName().equals(name)) {
                tasks.remove(index);
            }
        }
    }
    
    // when called, this method will make an unappended String and then add to ti and then return the amount of tasks
    public String viewTasks() {
        String unappendedString = "Your Tasks are to: ";
        
        for (Task task : tasks) {
            unappendedString = unappendedString +  task;
        }
        
        return unappendedString;
    }
    
    public void completeTask(String tName) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(tName)) {
                task.markAsComp();
            }
        }
    }
    
    
}