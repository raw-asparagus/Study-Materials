import java.util.*;

// this program tries to (but will likely fail) echo whatever input is provided to it
// test this using input redirection
public class ScannerInputDemo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Scanner 1's first line:");
        if (sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
        }
        System.out.println("Scanner 2's subsequent lines:");
        while (sc2.hasNextLine()) {
            System.out.println(sc2.nextLine());
        }
        
        // additional input could still be stored here!
        System.out.println("Scanner 1's remaining lines:");
        while (sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
        }
    }
}