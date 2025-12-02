import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.print("Masukkan operasi aritmatika(+, -, *, /, %): ");
            char pilihan = input.next().charAt(0);

            switch (pilihan) {
                case '+':
                    System.out.println("Hasilnya: " + (angka1 + angka2));
                    break;
                case '-':
                    System.out.println("Hasilnya: " + (angka1 - angka2));
                    break;
                case '*':
                    System.out.println("Hasilnya: " + angka1 * angka2);
                    break;
                case '/':
                    if (angka2 != 0) {
                        System.out.println("Hasilnya: " + angka1 / angka2);
                    } else {
                        System.out.println("Tidak dapat melakukan pembagian dengan angka 0.");
                    }
                    break;
                case '%':
                    if (angka2 != 0) {
                        System.out.println("Hasilnya: " + angka1 % angka2);
                    } else {
                        System.out.println("Tidak dapat melakukan modulus dengan angka 0.");
                    }
                    break;
                default:
                    System.out.println("Input tidak valid!");

            }

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid!");
            System.out.println("Detail error: " + e.getMessage());
        } finally {
            input.close();
        }

    }

}
