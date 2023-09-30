import java.util.Scanner;

public class Tp03_soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();

        int tahunLahir = input.nextInt();
        int tahunSekarang = java.time.Year.now().getValue();
        int usia = tahunSekarang - tahunLahir;

        System.out.println("Halo," + nama + ".");
        System.out.println("Ternyata usiamu baru " +  usia + " tahun ya !");
        input.close();
    }
    //     public static int hitungUsia(int tahunLahir) {
    //     int tahunSekarang = java.time.Year.now().getValue();
    //     return tahunSekarang - tahunLahir;
    // }
}
