// Creating a class Student that prints out the name and age of a university student

public class Student {

    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
        //By saying getName() you are asking the user running the program to enter some information which it will use
        //If you enter information into the getName(...) your program will use the data in the parentheses
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return "The name of the student is " + name + "." + " The student is " + age + " years old.";
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age) {
       if (age < 16){
        System.out.println("The university does not accept students below 16");
        }
        else if (age > 99){
            System.out.println("The university does not accept students that are older than 99");
        }
        else 
        {
            this.age = age;
        }
       } 
        /*
        If you want an if statement and else if statement to check something again, that is, run through one line, 
        and if it not true, then it runs the second line, and then if it also is not true, executes the last line 
        */
    }