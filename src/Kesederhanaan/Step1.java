package Kesederhanaan;

import java.util.Scanner;

public class Step1 {

    public static void main(String[] args) {

        // class input
        Scanner input = new Scanner(System.in);

        // meminta user menginputkan sesuatu
        System.out.print("Masukkan sesuatu: ");
        String inputUser = input.nextLine();

        // cetak hasil inputan
        System.out.println("Kamu mengetik: " + inputUser);

        // tutup Scanner
        input.close();

    }

}