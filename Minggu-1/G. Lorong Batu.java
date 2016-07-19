import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class LorongBatu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n, result;
        String row1, row2;

        t = sc.nextInt();
        for (int a = 0; a < t; a++) {
            n = sc.nextInt();

            row1 = sc.next();
            row2 = sc.next();
            int arr[] = new int[n * 2 + 1];
            result = 0;
            
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (row1.charAt(i) == '1') {
                    arr[index++] = i + 1;
                }
                if (row2.charAt(i) == '1') {
                    arr[index++] = i + 1;
                }
            }
            
            if (index % 2 == 0 && index != 0) {
                arr[index] = arr[index - 1] + 1;
            }
            int selisih;
            for (int i = 0; i < index;) {
                selisih = arr[i + 1] - arr[i];
                if (selisih > 1) {
                    i++;
                } else {
                    i += 2;
                }
                result++;
            }
            System.out.println(result);
        }

    }
}
