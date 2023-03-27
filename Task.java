import java.util.HashMap;

public class Task implements Comparable<Task>{

    private String description;
    private int priority;
    private int workload;
    private HashMap<Integer, String> PriorityMap;

    public Task(String description, int priority, int workload){
        this.description = description;
        this.priority = priority;
        this.workload = workload;

        PriorityMap = new HashMap<>();
        PriorityMap.put(1, "very important");
        PriorityMap.put(2, "important");
        PriorityMap.put(3, "unimportant");
        PriorityMap.put(4, "after learn Portuguese");

    }

    public String toString(){
        String NamedPriority = PriorityMap.get(priority);
            return description + " takes " + workload + " minutes and has priority " + NamedPriority;

    }

    public int getWorkload(){
        return this.workload;
    }

    public int getPriority(){
        return this.priority;
    }

    @Override
    public int compareTo(Task task2) {
        int compare = Integer.compare(priority, workload);
        if(compare == 0){}
        return compare;
    }

}
