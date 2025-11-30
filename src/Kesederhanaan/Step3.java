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

        if (angka1 > angka2 && angka1 > angka3) {
            System.out.println("Angka terbesar adalah: " + angka1);
        } else if (angka2 > angka1 && angka2 > angka3) {
            System.out.println("Angka terbesar adalah: " + angka2);
        } else if (angka3 > angka1 && angka3 > angka2) {
            System.out.println("Angka terbesar adalah: " + angka3);
        } else {
            System.out.println("Angka pertama, kedua dann ketiga sama.");
        }

        input.close();

    }

}
