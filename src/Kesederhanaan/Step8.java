package Kesederhanaan;

import java.util.Scanner;

public class Step8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int angkaPositif = Math.abs(angka);
        int jumlahDigit = String.valueOf(angkaPositif).length();

        System.out.println("Jumlah digit: " + jumlahDigit);

        input.close();

    }

}
