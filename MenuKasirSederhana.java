import java.util.Scanner;

public class MenuKasirSederhana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==== Menu Kasir Sederhana ====\n");

        // harga per menu
        int nasiGoreng = 12_000;
        int nasiPadang = 12_000;
        int nasiPecel = 7_000;
        int nasiKebuli = 16_000;
        int nasiCampur = 6_000;
        int ayamGeprek = 10_000;
        int mieAyam = 5_000;
        int teh = 3_000;
        int kopi = 4_000;
        int susu = 5_000;

        boolean ulang = true;

        while (ulang) {

            // menampilkan pilihan
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

            System.out.print("\nSilahkan pilih menu(1-10): ");
            byte pilihMenu = input.nextByte();

            int harga = 0;

            switch (pilihMenu) {
                case 1 -> harga = nasiGoreng;
                case 2 -> harga = nasiPadang;
                case 3 -> harga = nasiPecel;
                case 4 -> harga = nasiKebuli;
                case 5 -> harga = nasiCampur;
                case 6 -> harga = ayamGeprek;
                case 7 -> harga = mieAyam;
                case 8 -> harga = teh;
                case 9 -> harga = kopi;
                case 10 -> harga = susu;
                default -> {
                    System.out.println("Menu tidak tersedia.");
                    return;
                }
            }

            System.out.print("\nMasukkan jumlah pesanan: ");
            int jumlah = input.nextInt();

            int total = harga * jumlah;

            System.out.printf("%nTotal pesanan: Rp.%,d%n", total);

            System.out.print("\nPembayaran: ");
            int bayar = input.nextInt();

            if (bayar < total) {
                System.out.println("\nUang tidak cukup! pembayaran di batalkan.");
                return;
            }

            int kembalian = bayar - total;
            System.out.printf("%nUang kembalian: Rp.%,d%n", kembalian);

            System.out.print("\nMau tambah pesanan(y/n): ");
            char jawab = input.next().charAt(0);
            if (jawab == 'y' || jawab == 'Y') {
                ulang = true;
            } else {
                ulang = false;
            }

        }

        System.out.println("\n==== TERIMA KASIH ====");
        input.close();

    }

}