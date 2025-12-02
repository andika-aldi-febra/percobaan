import java.util.Scanner;

public class MenuKasirSederhana3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==== Menu Kasir Sederhana ====\n");

        // harga per menu
        final int nasiGoreng = 12_000;
        final int nasiPadang = 12_000;
        final int nasiPecel  = 7_000;
        final int nasiKebuli = 16_000;
        final int nasiCampur = 6_000;
        final int ayamGeprek = 10_000;
        final int mieAyam    = 5_000;
        final int teh        = 3_000;
        final int kopi       = 4_000;
        final int susu       = 5_000;

        boolean ulang = true;

        while (ulang) {

            // tampilan menu
            System.out.println("1. Nasi Goreng : Rp." + nasiGoreng);
            System.out.println("2. Nasi Padang : Rp." + nasiPadang);
            System.out.println("3. Nasi Pecel  : Rp." + nasiPecel);
            System.out.println("4. Nasi Kebuli : Rp." + nasiKebuli);
            System.out.println("5. Nasi Campur : Rp." + nasiCampur);
            System.out.println("6. Ayam Geprek : Rp." + ayamGeprek);
            System.out.println("7. Mie Ayam    : Rp." + mieAyam);
            System.out.println("8. Teh         : Rp." + teh);
            System.out.println("9. Kopi        : Rp." + kopi);
            System.out.println("10. Susu       : Rp." + susu);

            System.out.print("\nSilahkan pilih menu (1-10): ");
            byte pilihMenu = input.nextByte();

            int harga = switch (pilihMenu) {
                case 1 -> nasiGoreng;
                case 2 -> nasiPadang;
                case 3 -> nasiPecel;
                case 4 -> nasiKebuli;
                case 5 -> nasiCampur;
                case 6 -> ayamGeprek;
                case 7 -> mieAyam;
                case 8 -> teh;
                case 9 -> kopi;
                case 10 -> susu;
                default -> -1;
            };

            if (harga == -1) {
                System.out.println("Menu tidak tersedia.");
                continue;
            }

            System.out.print("Jumlah pesanan: ");
            int jumlah = input.nextInt();

            int total = harga * jumlah;
            System.out.printf("Total pesanan: Rp.%,d%n", total);

            System.out.print("Pembayaran: ");
            int bayar = input.nextInt();

            if (bayar < total) {
                System.out.println("Uang tidak cukup! Transaksi dibatalkan.");
                continue;
            }

            int kembalian = bayar - total;
            System.out.printf("Uang kembalian: Rp.%,d%n", kembalian);

            System.out.print("\nMau tambah pesanan (y/n): ");
            char jawab = input.next().charAt(0);

            ulang = (jawab == 'y' || jawab == 'Y');
            System.out.println();
        }

        System.out.println("==== TERIMA KASIH ====");
        input.close();
    }
}
