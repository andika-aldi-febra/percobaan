import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("masukkan jumlah angka: ");
        int hitung = scan.nextInt();

        for (int i = 1; i <= hitung; i++) {
            if (i == 5) {
                System.out.println("queen");
            } else if (i == 12) {
                System.out.println("kurumi tokisaki");
            } else if (i == 14 || i == 25) {
                System.out.println("alfasa");
            } else {
                System.out.println("iterasi ke: " + i);
            }

        }

    }

}