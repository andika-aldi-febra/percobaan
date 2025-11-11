import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorSederhana1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SELAMAT DATANG DI KALKULATOR SEDERHANA ===");

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.print("Masukkan operasi(+, -, *, /, %): ");
            char operasi = input.next().charAt(0);

            if ((operasi == '/' || operasi == '%') && angka2 == 0) {
                System.out.println("Error! tidak dapat melakukan pembagian atau modulus dengan angka 0.");
                return;
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
                    System.out.println("Operator tidak dikenali");
                    return;
            }
            System.out.println("=== HASIL PERHITUNGAN ===");
            System.out.println("=========================");
            System.out.printf("Angka pertama: %.2f%n", angka1);
            System.out.printf("Angka kedua  : %.2f%n", angka2);
            System.out.printf("Operator     : %c%n", operasi);
            System.out.printf("Hasil        : %.2f%n", hasil);
            System.out.println("=========================");
        } catch (InputMismatchException e) {
            System.out.println("Masukkan angka bukan huruf!");
            System.out.println("Detail: " + e.getMessage());
        } finally {
            input.close();
        }

    }
}
