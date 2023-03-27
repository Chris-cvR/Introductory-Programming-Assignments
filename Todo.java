import java.util.ArrayList;
import java.util.Comparator;

public class Todo {

    private ArrayList<Task> TodoList;
    private int RunningWorkload;


    public Todo(){
        this.TodoList = new ArrayList<>();
        this.RunningWorkload = 0;
    }

    
    public void addTask(String description, int priority, int minutes){
        if(priority < 1 || priority > 4){
            System.out.println(description + " has invalid priority");
        }
        else if(minutes < 0){
            System.out.println(description + " has invalid workload");
        }
        else{
            Task t = new Task(description, priority, minutes);
            TodoList.add(t);
        }       
    }

    public void print(){
        if(TodoList.size() == 0){
            System.out.println("Todo:");
            System.out.println("-----");
            System.out.println("You're all done for today! #TodoZero");                
        }
        else{
            System.out.println("Todo:");
            System.out.println("-----");
                for (Task task : TodoList) {
                    System.out.println(task.toString());
                }
        }
            if(RunningWorkload > 0){
                System.out.println(RunningWorkload + " minutes of work done!");
            }
    }

    public void completeTask(int index){
        if(index >= TodoList.size() || index < 0){
            System.out.println("Invalid index");
        }
        else{
            RunningWorkload += TodoList.get(index).getWorkload();
            TodoList.remove(index);
        }
    }

    public void printPriority(int limit){
        System.out.println("Filtered todo:");
        System.out.println("--------------");
            for (Task task : TodoList) {
                int printingPriority = task.getPriority();
                if(printingPriority <= limit){
                    System.out.println(task.toString());
                }
            }
    }

    public void printPrioritized(){
        System.out.println("Prioritized todo:");
        System.out.println("-----------------");
        
        TodoList.sort(Comparator.comparing(Task::getPriority)
            .thenComparing(Task::getWorkload));

            for (Task task : TodoList) {
                System.out.println(task.toString());
            }
    }
}


