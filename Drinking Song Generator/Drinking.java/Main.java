import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String container = scan.next();
        scan.next();
        String drink = scan.next();

        Drinking drk = new Drinking(n, container, drink);

        drk.toSong();
    }
}
//99 bottles of beer

/*
 * 2 bottles of beer on the wall
2 bottles of beer
Take one down, pass it around
One bottle of beer on the wall

One bottle of beer on the wall
One bottle of beer
Take one down, pass it around
No more bottles of beer on the wall
 */