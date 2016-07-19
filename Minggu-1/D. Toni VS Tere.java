import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class ToniTere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        String x, y;

        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            x = sc.next();
            y = sc.next();

            BigDecimal xBig = new BigDecimal(x);
            BigDecimal yBig = new BigDecimal(y);
            BigDecimal total = xBig.add(yBig);
            BigDecimal tenPersen = total.divide(new BigDecimal("2")).add(new BigDecimal("1"));
            
            if (xBig.compareTo(tenPersen) >= 0) {
                System.out.println("Tere");
            } else if (yBig.compareTo(tenPersen) >= 0) {
                System.out.println("Toni");
            } else {
                System.out.println("Voting Ulang");
            }
        }
    }
}
