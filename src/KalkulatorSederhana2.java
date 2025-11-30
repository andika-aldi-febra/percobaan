import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorSederhana2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang;

        System.out.println("===== SELAMAT DATANG DI KALKULATOR SEDERHANA =====");

        do {
            try {
                System.out.println();
                System.out.print("Masukkan angka pertama: ");
                double angka1 = input.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                double angka2 = input.nextDouble();

                System.out.print("Pilih operasi(+, -, *, /, %): ");
                char operasi = input.next().charAt(0);

                double hasil = 0;

                if ((operasi == '/' || operasi == '%') && angka2 == 0) {
                    System.out.println("Invalid! tidak dapat melakukan pembagian atau modulus dengan angka 0.");
                    System.out.print("\nApakah anda ingin mengulang kembali(y/n): ");
                    ulang = input.next().charAt(0);
                    continue;
                }

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
                        System.out.println("Input tidak valid!");
                        System.out.print("\nApakah anda ingin mengulang kembali(y/n): ");
                        ulang = input.next().charAt(0);
                        continue;
                }

                System.out.println();
                System.out.println("===============================");
                System.out.println("====== HASIL PERHITUNGAN ======");
                System.out.println("===============================");
                System.out.printf("Angka pertama : %.2f%n", angka1);
                System.out.printf("Angka kedua   : %.2f%n", angka2);
                System.out.printf("Operasi       : %c%n", operasi);
                System.out.printf("Hasil         : %.2f%n", hasil);

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Masukkan angka, bukan huruf.");
                input.nextLine(); // bersihkan buffer
            }

            System.out.print("\nApakah anda ingin mengulang kembali(y/n): ");
            ulang = input.next().charAt(0);
            input.nextLine(); // bersihkan buffer setelah input karakter

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTerima kasih! sudah menggunakan kalkulator sederhana");
        input.close();
    }
}
