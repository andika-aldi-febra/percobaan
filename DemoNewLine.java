import java.util.Scanner;

public class DemoNewLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("Umur anda: " + umur);
        System.out.println("Tinggi anda: " + tinggi);
        System.out.println("Nama: " + nama);


        input.close();

    }

}
