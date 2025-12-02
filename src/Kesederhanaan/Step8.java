package Kesederhanaan;

import java.util.Scanner;

public class Step8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int jumlahDigit = String.valueOf(Math.abs(angka)).length();

        System.out.println("Jumlah digit: " + jumlahDigit);

        input.close();

    }

}
