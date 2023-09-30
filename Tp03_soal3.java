import java.util.Scanner;

public class Tp03_soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int T = input.nextInt();

        int jatahpermensetiaporang = N / (T + 1);

        int sisaPermen = N % (T + 1);

        System.out.println(jatahpermensetiaporang);
        System.out.println(sisaPermen);

        input.close();
    }
}
