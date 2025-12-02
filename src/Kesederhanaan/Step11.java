package Kesederhanaan;

import java.util.Scanner;

public class Step11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int angkaPositif = Math.abs(angka);

        int angkaTerbalik = 0;

        while (angkaPositif > 0) {

            int digit = angkaPositif % 10;
            angkaTerbalik = angkaTerbalik * 10 + digit;
            angkaPositif /= 10;

        }

        System.out.println("Angka Terbalik: " + angkaTerbalik);

        input.close();

    }

}
