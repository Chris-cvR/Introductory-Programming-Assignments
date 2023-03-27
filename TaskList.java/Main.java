public class Main {

    public static void main(String[] args) {
        
		Todo todo;
		todo = new Todo();
		todo.addTask("Pickup kids", 1, 15);
		todo.addTask("Cook dinner", 1, 45);
		todo.addTask("Do dishes", 2, 30);
		todo.addTask("Phone mom", 3, 240);
		todo.addTask("Read chapter 10 of BlueJ book", 4, 180);
		todo.completeTask(5);
		todo.completeTask(1);
		todo.completeTask(-1);
		todo.print();

        
    }
    
}
