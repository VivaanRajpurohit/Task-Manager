import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TaskCreator taskCreator = new TaskCreator();
        
        // keep going until we break
        while (true) {
            System.out.print("\n\t\t\tChoose an option \n\nadd task, delete task, complete task, view tasks, quit program: ");
            String userResponse = input.nextLine();
            
            if (userResponse.equals("add task")) {
                // ask for the name
                System.out.print("\nEnter the name of the task you want to be created: ");
                String name = input.nextLine();
                
            // ask for priority
                System.out.print("Now enter a priority: ");
                int prior = input.nextInt();
                input.nextLine();
                
                taskCreator.addTask(name, prior);
            } 
            
            else if (userResponse.equals("complete task")) {
                // ask for the name
                System.out.print("\nEnter the exact name for the task you wanted completed: ");
                String name = input.nextLine();
                System.out.print("\nCompleted\n");
                
            // ask for priority
                taskCreator.completeTask(name);
            } 
            
            else if (userResponse.equals("view tasks")) {
                System.out.println(taskCreator.viewTasks());
            } 
            
            else if (userResponse.equals("quit program")) {
                break;
            } 
            
            else if (userResponse.equals("delete task")) {
                System.out.print("\nEnter the name of the task to delete (EXACT NAME): ");
                String name = input.nextLine();
                
                taskCreator.removeTask(name);
                System.out.print("\nDeleted\n");
            } 
            
            else {
                System.out.println("Please Enter a valid command.");
            }
        }
    }
}