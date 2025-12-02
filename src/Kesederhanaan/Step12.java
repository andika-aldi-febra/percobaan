package Kesederhanaan;

import java.util.Scanner;

public class Step12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if(angka < 0) {
            System.out.println("Angka negatif tidak punya faktorial.");
            return;
        }

        long hasil = 1;

        /*
        for (int i = angka; i >= 1; i--) {
        hasil *= i;
        }
         */
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        System.out.printf("Hasil faktorial dari %d adalah %d", angka, hasil);

        input.close();

    }

}
