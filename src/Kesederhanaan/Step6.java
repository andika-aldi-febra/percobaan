package Kesederhanaan;

import java.util.Scanner;

public class Step6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        char tambah;

        do {

            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            input.nextLine();

            total += angka;

            System.out.print("Mau tambah angka lagi(y/n): ");
            tambah = input.next().charAt(0);

        } while (tambah == 'y' || tambah == 'Y');

        System.out.println("Program selesai.");
        System.out.println("Total angka: " + total);

        input.close();

    }

}
