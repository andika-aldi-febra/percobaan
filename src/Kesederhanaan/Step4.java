package Kesederhanaan;

import java.util.Scanner;

public class Step4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==== CEK TAHUN KABISAT ATAU BUKAN ====\n");

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        if (tahun % 400 == 0) {
            System.out.println("Tahun kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println("Bukan tahun kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        input.close();

    }

}
