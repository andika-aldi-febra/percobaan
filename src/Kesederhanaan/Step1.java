package Kesederhanaan;

import java.util.Scanner;

public class Step1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sesuatu: ");
        String inputUser = input.nextLine();

        System.out.println("Kamu mengetik: " + inputUser);

        input.close();

    }

}