import java.util.Scanner;

public class LoginSederhana3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nameTrue = "kurumi tokisaki";
        String passwordTrue = "1234";
        byte kesempatan = 5;
        boolean berhasil = false;

        do {

            System.out.print("Nama: ");
            String name = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            if (name.equals(nameTrue) && password.equals(passwordTrue)) {
                System.out.println("Selamat datang " + nameTrue);
                berhasil = true;
                break;
            } else {
                kesempatan--;
                System.out.println("Sisa kesempatan: " + kesempatan);
            }

        } while (kesempatan > 0);

        if (!berhasil) {
            System.out.println("Mohon maaf! sisa kesempatan = " + kesempatan + ", Silahkan coba lain kali.");
        }

        input.close();

    }

}