package Kesederhanaan;

import java.util.Scanner;

public class Step5 {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Total belanja: ");
        int totalBelanja = input.nextInt();

        double diskon = 0;
        double totalAkhir = totalBelanja;

        if (totalBelanja >= 100_000) {
            diskon = totalBelanja * 0.20;
            totalAkhir = totalBelanja - diskon;
            System.out.println("Diskon 20%");
            System.out.printf("Harga awal: Rp.%,d%n", totalBelanja);
            System.out.printf("Harga setelah diskon: Rp.%,.0f%n", totalAkhir);
        }  else if (totalBelanja >= 50_000) {
            diskon = totalBelanja * 0.10;
            totalAkhir = totalBelanja - diskon;
            System.out.println("Diskon 10%");
            System.out.printf("Harga awal: Rp.%,d%n", totalBelanja);
            System.out.printf("Harga setelah diskon: Rp.%,.0f%n", totalAkhir);
        } else {
            System.out.println("Tidak dapat diskon.");
            System.out.printf("Total belanja: Rp.%,d%n", totalBelanja);
        }

        input.close();

    }

}
