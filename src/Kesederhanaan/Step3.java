package Kesederhanaan;

import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = input.nextInt();

        // Cek apakah semua sama
        if (angka1 == angka2 && angka2 == angka3) {
            System.out.println("Ketiga angka sama.");
        } else {
            int terbesar = angka1;

            if (angka2 > terbesar) {
                terbesar = angka2;
            }

            if (angka3 > terbesar) {
                terbesar = angka3;
            }

            System.out.println("Angka terbesar adalah: " + terbesar);
        }

        input.close();

    }

}
