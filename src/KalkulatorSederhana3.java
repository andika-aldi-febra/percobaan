import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorSederhana3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang = 0;

        System.out.println("=== KALKULATOR SEDERHANA ===");

        do {

            try {

                System.out.println();
                System.out.print("Masukkan angka pertama: ");
                double angka1 = input.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                double angka2 = input.nextDouble();

                System.out.print("Pilih operasi(+, -, *, /, %): ");
                char operasi = input.next().charAt(0);

                if ((operasi == '/' || operasi == '%') && angka2 == 0) {
                    System.out.println();
                    System.out.println("Tidak dapat melakukan pembagian atau modulus dengan angka 0.");
                    continue;   // cukup lompat ulang, jangan return
                }

                double hasil;

                switch (operasi) {
                    case '+': hasil = angka1 + angka2; break;
                    case '-': hasil = angka1 - angka2; break;
                    case '*': hasil = angka1 * angka2; break;
                    case '/': hasil = angka1 / angka2; break;
                    case '%': hasil = angka1 % angka2; break;
                    default:
                        System.out.println("Input operasi tidak valid.");
                        continue;  // balik ke awal loop
                }

                System.out.println();
                System.out.println("=============================");
                System.out.println("===== HASIL PERHITUNGAN =====");
                System.out.println("=============================");
                System.out.println();

                System.out.printf("Angka pertama : %.2f%n", angka1);
                System.out.printf("Angka kedua   : %.2f%n", angka2);
                System.out.printf("Operasi       : %c%n", operasi);
                System.out.printf("Hasil         : %.2f%n", hasil);
                System.out.println();

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Invalid! hanya menerima angka.");
                input.nextLine(); // bersihkan buffer
                continue;          // ulang lagi tanpa tanya
            }

            System.out.print("Apakah anda ingin mengulang(y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih!");
        input.close();

    }

}
