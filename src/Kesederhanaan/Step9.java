package Kesederhanaan;

import java.util.Scanner;

public class Step9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int angkaPositif =  Math.abs(angka);

        int genap = 0;
        int ganjil = 0;

        while (angkaPositif > 0) {

            int digit = angkaPositif % 10;

            if (digit % 2 == 0) {
                genap += digit;
            } else {
                ganjil += digit;
            }

            angkaPositif /= 10;

        }

        System.out.println("Jumlah digit genap: " + genap);
        System.out.println("Jumlah digit ganjil: " + ganjil);

        input.close();

    }

}
