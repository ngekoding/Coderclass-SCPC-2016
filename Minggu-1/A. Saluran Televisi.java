import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class SaluranTelevisi {
    
    public static int generate(String cmd, int num) {
        if (cmd.equals("next")) {
            if (num == 0) {
                return 99;
            } else {
                return (num - 1) % 99;
            }
        }
        return (num + 1) % 100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, x;
        String cmd;
        
        t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            cmd = sc.next();
            x = sc.nextInt();
            System.out.println(generate(cmd, x));
        }
    }
}
