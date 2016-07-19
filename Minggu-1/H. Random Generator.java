import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class RandomGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n, p;
        double result, tmp;
        
        t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            p = sc.nextInt();
            
            result = Math.pow(2, n-1) * p / 100;
            tmp = result;
            for (int j = n - 1; j > 0; j--) {
                tmp /= 2;
                result += tmp;
            }
            System.out.println(result);
        }
    }
}
