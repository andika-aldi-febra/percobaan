import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LoginSederhana1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        final int MAX_ATTEMPTS = 5;
        final long TIMEOUT_DURATION = 60; // dalam detik (1 menit)

        do {
            String userNameBenar = "admin";
            String passwordBenar = "12345678";
            int attempts = 0;
            boolean loginSuccess = false;
            boolean locked = false;

            while (attempts < MAX_ATTEMPTS && !loginSuccess && !locked) {
                System.out.print("Username: ");
                String username = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();

                if (userNameBenar.equals(username) && passwordBenar.equals(password)) {
                    System.out.println("Selamat datang, admin!");
                    loginSuccess = true;
                } else {
                    attempts++;
                    int remainingAttempts = MAX_ATTEMPTS - attempts;

                    if (remainingAttempts > 0) {
                        System.out.println("Username atau password tidak valid!");
                        System.out.println("Kesempatan tersisa: " + remainingAttempts + " kali");
                        System.out.println();
                    } else {
                        System.out.println("Anda telah melebihi batas percobaan login!");
                        System.out.println("Silakan tunggu 1 menit sebelum mencoba lagi.");

                        // Timer untuk timeout 1 menit
                        try {
                            for (int i = 60; i > 0; i--) {
                                System.out.print("\rTunggu " + i + " detik...");
                                TimeUnit.SECONDS.sleep(1);
                            }
                            System.out.println("\nTimeout selesai! Silakan coba lagi.");
                            System.out.println();
                        } catch (InterruptedException e) {
                            System.out.println("\nTimer terinterupsi!");
                        }
                        locked = true;
                    }
                }
            }

            if (!loginSuccess && !locked) {
                System.out.println("Anda telah melebihi batas percobaan login!");
                System.out.println("Silakan tunggu 1 menit sebelum mencoba lagi.");

                // Timer untuk timeout 1 menit
                try {
                    for (int i = 60; i > 0; i--) {
                        System.out.print("\rTunggu " + i + " detik...");
                        TimeUnit.SECONDS.sleep(1);
                    }
                    System.out.println("\nTimeout selesai! Silakan coba lagi.");
                } catch (InterruptedException e) {
                    System.out.println("\nTimer terinterupsi!");
                }
            }

            System.out.print("Apakah anda ingin mengulang (y/n): ");
            ulang = input.next().charAt(0);
            input.nextLine(); // membersihkan newline character

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih!");
        input.close();
    }
}