package Kesederhanaan;

import java.util.Scanner;

public class Step7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.printf("Angka positif: %+d%n", angka);
        } else if (angka < 0) {
            System.out.printf("Angka negatif: %d%n", angka);
        } else {
            System.out.println("Angka nol");
        }

        input.close();

    }

}
