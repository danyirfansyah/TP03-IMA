import java.util.Scanner;

public class Tp03_soal1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        // Scanner input2 = new Scanner(System.in);

        // Input suhu dalam Celcius
        double celcius1 = input1.nextDouble();
        double celcius2 = input1.nextDouble();

        // Konversi ke Fahrenheit
        double fahrenheit1 = (celcius1 * 9/5) + 32;
        double fahrenheit2 = (celcius2 * 9/5) + 32;

        // Konversi ke Kelvin
        double kelvin1 = celcius1 + 273.15;
        double kelvin2 = celcius2 + 273.15;

        // Menampilkan hasil konversi
        System.out.println(fahrenheit1 + " F, " + fahrenheit2 + " F"); 
        System.out.println(kelvin1 + " K, " + kelvin2 + " K");

        input1.close();
    }
}
