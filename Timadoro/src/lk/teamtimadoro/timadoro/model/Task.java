/**
 * @project Timadoro
 * @author Hyacinth
 */

package lk.teamtimadoro.timadoro.model;

// Task class for create, update and delete tasks
public class Task {
    
    // Ignoring "FieldMayybeFinal" warnings
    @SuppressWarnings("FieldMayBeFinal")
    
    // Variable declaration
    private String Tname;
    private String Tdue;
    private int Tprio;
    private int Trepeat;
    
    // Constructor for creating and editing a task
    public Task(String taskName, String taskDueDate, int taskPriority, int taskCycles){
        this.Tname = taskName;
        this.Tdue = taskDueDate;
        this.Tprio = taskPriority;
        this.Trepeat = taskCycles;
    }
    
    // Consructor for removing a task
    public Task(String taskName){
        this.Tname = taskName;
    }
    
    // To create a new task
    public void createTask(){
       // TODO: add createTask method  of the DataConnector class
    }
    
    // To remove a task
    public void removeTask(){
        // TODO: add removeTask method of the DataConnector class
    }
    
    // To edit a task
    public void editTask(){
        // TODO: add editTask method of the DataConnecor class.
    }
    
}
