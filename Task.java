import java.util.ArrayList;

public class Task {
    private String taskName;
    private int taskPriority;
    private boolean taskComp;
    
    // Constructor one
    public Task(String name, int priority) {
        taskName = name;
        taskPriority = priority;
        taskComp = false;
    }
    
    // Overloaded Constructor
    public Task(String name) {
        taskName = name;
        taskComp = false;
    }
    
    public void markAsComp() {
        taskComp = true;
    }
    
    public String getTaskName() {
        return taskName;
    }
    
    public String toString() {
        String statusString;
        
        if (taskComp == true) {
            statusString = "Complete";
        } else {
            statusString = "Not Complete";
        }
        
        return "\n\nName: " + taskName + "\nPriority: " + taskPriority + "\nStatus: " + statusString + "\n";
    }
}