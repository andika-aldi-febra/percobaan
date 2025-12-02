import java.util.Scanner;

public class LoginSederhana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            String userNameBenar = "admin";
            String passwordBenar = "12345678";

            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (userNameBenar.equals(username) && passwordBenar.equals(password)) {
                System.out.println("Selamat datang, admin!");
            } else {
                System.out.println("username atau password tidak valid");
            }

            System.out.println("Apakah anda ingin mengulang(y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang ==  'y' || ulang == 'Y');

        System.out.println("Terima kasih!");
        input.close();

    }

}
