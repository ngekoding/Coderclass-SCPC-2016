import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class CompFestSeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean changed;
        
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            changed = false;
            if (i%3 == 0) {
                changed = true;
                System.out.print("Comp");
            }
            if (i%5 == 0) {
                changed = true;
                System.out.print("Fest");
            }
            if (i%7 == 0) {
                changed = true;
                System.out.print("Seven");
            }
            if (!changed) {
                System.out.print(i);
            }
            if (i != n) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
