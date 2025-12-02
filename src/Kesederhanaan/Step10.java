package Kesederhanaan;

import java.util.Scanner;

public class Step10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int angkaPositif = Math.abs(angka);

        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        while (angkaPositif > 0) {

            int digit = angkaPositif % 10;

            if (digit % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }

            angkaPositif /= 10;

        }

        System.out.println("Jumlah digit genap: " + jumlahGenap);
        System.out.println("Jumlah digit ganjil: " + jumlahGanjil);

        input.close();

    }

}
