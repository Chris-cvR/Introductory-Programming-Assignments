import java.util.ArrayList;
import java.util.Scanner;

public class Drinking {

    private int n;
    private String container;
    private String drink;

    public Drinking(int n, String container, String drink)
    {
        Scanner title = new Scanner(System.in);

        this.n = n;
        this.container = container;
        this.drink = drink;
    }

    public void toSong()
    {
        for (int i = n; i > 0; i--) 
            if (n > 2)
        {
            System.out.println(n + " " + container + " of " + drink + " on the wall");
            System.out.println(n + " " + container + " of " + drink);
            System.out.println("Take one down, pass it around");
            System.out.println(n - 1 + " " + container + " of " + drink + " on the wall");
            System.out.println("\n");
            this.n--;
        }
        else if (n == 2)
        {
            System.out.println(n + " " + container + " of " + drink + " on the wall");
            System.out.println(n + " " + container + " of " + drink);
            System.out.println("Take one down, pass it around");
            System.out.println("One " + container.substring(0, container.length() - 1) + " of " + drink + " on the wall");
            System.out.println("\n");
            this.n--;
        }
        else if (n == 1)
        {
            System.out.println("One " + container.substring(0, container.length() - 1) + " of " + drink + " on the wall");
            System.out.println("One " + container.substring(0, container.length() - 1) + " of " + drink);
            System.out.println("Take one down, pass it around");
            System.out.println("No more " + container + " of " + drink + " on the wall");
            System.out.println("\n");
        }
    }
}