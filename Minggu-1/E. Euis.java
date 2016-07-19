import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class Euis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long n = 1;
        for (int i = 0; i < str.length();) {
            if (str.charAt(i) == 'e') {
                if ((i + 1) < str.length()) {
                    if (str.charAt(i + 1) == 'u') {
                        n *= 3;
                        n %= 1000000007;
                        i += 2;
                        continue;
                    }
                }
                n *= 2;
                n %= 1000000007;
            }
            i++;
        }
        System.out.println(n);
    }
}
