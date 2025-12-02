import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorSederhanaFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang = 0;

        System.out.println("=== SELAMAT DATANG DI KALKULATOR SEDERHANA ===");

        do {
            try {
                System.out.print("\nMasukkan angka pertama: ");
                double angka1 = input.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                double angka2 = input.nextDouble();

                System.out.print("Masukkan operasi (+, -, *, /, %): ");
                char operasi = input.next().charAt(0);

                if ((operasi == '/' || operasi == '%') && angka2 == 0) {
                    System.out.println("Error! Tidak dapat melakukan pembagian atau modulus dengan angka 0.");
                    continue; // kembali ke awal loop
                }

                double hasil;

                switch (operasi) {
                    case '+':
                        hasil = angka1 + angka2;
                        break;
                    case '-':
                        hasil = angka1 - angka2;
                        break;
                    case '*':
                        hasil = angka1 * angka2;
                        break;
                    case '/':
                        hasil = angka1 / angka2;
                        break;
                    case '%':
                        hasil = angka1 % angka2;
                        break;
                    default:
                        System.out.println("Operator tidak dikenali!");
                        continue;
                }

                // kasih spasi biar rapi
                System.out.println();
                System.out.println("=== HASIL PERHITUNGAN ===");
                System.out.println("=========================");
                System.out.printf("Angka pertama : %.2f%n", angka1);
                System.out.printf("Angka kedua   : %.2f%n", angka2);
                System.out.printf("Operator      : %c%n", operasi);
                System.out.printf("Hasil         : %.2f%n", hasil);
                System.out.println("=========================\n");

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Masukkan angka, bukan huruf.");
                input.nextLine(); // bersihkan buffer biar gak infinite loop
            }

            System.out.print("Apakah ingin menghitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTerima kasih sudah menggunakan kalkulator ini!");
        input.close();
    }
}
