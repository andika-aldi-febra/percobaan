package Kesederhanaan;

import java.util.Scanner;

public class Step13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int original = Math.abs(angka);
        int temp = original;

        int angkaTerbalik = 0;

        while (temp > 0) {

            int digit = temp % 10;
            angkaTerbalik = angkaTerbalik * 10 + digit;
            temp /= 10;

        }

        if (original == angkaTerbalik) {
            System.out.println("Angka palindrom");
        } else {
            System.out.println("Bukan palindrom");
        }

        input.close();

    }

}
