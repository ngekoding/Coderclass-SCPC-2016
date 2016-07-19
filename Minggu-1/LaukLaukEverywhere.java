import java.util.Scanner;

/**
 *
 * @author Nur
 */
public class LaukLaukEverywhere {

    static int findIndex(String str, String arr[]) {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (str.equals(arr[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kelompok[] = new String[1000];
        long nHidangan[] = new long[1000];
        int n = 0, i = -1;
        String str, pertanyaan;

        // Masukkan kelompok + hidangan
        do {
            str = sc.nextLine();
            // Kelompok makanan
            if (str.charAt(0) == '#') {
                i++;
                nHidangan[i] = 0;
                kelompok[i] = str.substring(2);
            } else {
                if (str.charAt(0) != '!') {
                    nHidangan[i]++;
                }
            }
        } while (str.charAt(0) != '!');

        // Masukkan Pertanyaan
        while (sc.hasNextLine()) {
            pertanyaan = sc.nextLine();
            String ex[] = pertanyaan.split("\\+");
            long kombinasi = 1;
            for (int j = 0; j < ex.length; j++) {
                String exTmp = ex[j].trim();
                kombinasi *= nHidangan[findIndex(exTmp, kelompok)];
            }
            System.out.println(kombinasi);
        }
    }
}
