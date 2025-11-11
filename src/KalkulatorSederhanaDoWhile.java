import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorSederhanaDoWhile {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    char ulang = 0;

    do {

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.print("Pilih operasi(+, -, *, /, %): ");
            char operasi = input.next().charAt(0);

            if ((operasi == '/' || operasi == '%') && angka2 == 0) {
                System.out.println("Invalid! tidak dapat melakukan pembagian dan modulus dengan angka 0.");
                continue;
            }

            double hasil;

            switch (operasi) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case  '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case  '/':
                    hasil = angka1 / angka2;
                    break;
                case '%':
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Input yang diberikan tidak valid!");
                    continue;
            }

            System.out.println("=== HASIL PENJUMLAHAN ===");
            System.out.println("=========================");
            System.out.printf("Angka pertama : %.2f%n", angka1);
            System.out.printf("Angka kedua   : %.2f%n", angka2);
            System.out.printf("Operasi       : %c%n", operasi);
            System.out.printf("Hasil         : %.2f%n", hasil);
            System.out.println("=========================");

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid!");
            System.out.println("Detail error: " + e.getMessage());
            continue;
        }

        System.out.println();
        System.out.print("Apakah anda ingin mengulanginya lagi(y/n): ");
        ulang = input.next().charAt(0);

    } while (ulang == 'y' || ulang == 'Y');

    System.out.println();
    System.out.println("Terima kasih, sudah menggunakan kalkulator sederhana");
    input.close();
    }

}
