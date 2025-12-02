import java.util.Scanner;

public class LoginSederhana2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang = 0;

        do {

            System.out.print("Nama lengkap: ");
            String nameLengkap = input.nextLine();

            System.out.print("Nama panggilan: ");
            String namaPanggilan = input.nextLine();

            System.out.print("Jenis kelamin(laki-laki/perempuan): ");
            String jenisKelamin = input.nextLine();

            System.out.print("Alamat lengkat: ");
            String alamatLengkat = input.nextLine();

            System.out.print("Nama ayah: ");
            String namaAyah = input.nextLine();

            System.out.print("Nama ibu: ");
            String namaIbu = input.nextLine();

            System.out.print("Apakah anda ingin menambahkan data tambahan: ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.print("=== TERIMA KASIH ===");
        input.close();

    }

}
