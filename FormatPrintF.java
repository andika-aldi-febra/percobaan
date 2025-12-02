public class FormatPrintF {

    public static void main(String[] args) {

        System.out.println("\n==== PENGGUNAAN PRINTF ====");

        System.out.println("\n==== CONVERSION SPECIFIER ====");

        System.out.println("\n==== FORMAT ANGKA INTEGER ====");
        System.out.printf("integer basis 10 = %d", 42); // untuk bilangan desimal yaitu(byte, short, int, long)
        System.out.printf("%noktal = %o", 10); // untuk bilangan oktal
        // untuk bilangan hexadesimal lower dan upper
        System.out.printf("%nhexadesimal lower = %x", 245);
        System.out.printf("%nhexadesimal upper = %X%n", 245);

        System.out.println("\n==== FORMAT ANGKA PECAHAN ====");
        System.out.printf("floating point(desimal biasa) = %f", 12.1);
        System.out.printf("%nscientific notation kecil = %e", 12.3);
        System.out.printf("%nscientific notation besar = %E", 12.6);
        // otomatis akan memilih format %f atau %e
        System.out.printf("%notomatis pilih = %g", 13.23);
        System.out.printf("%nhexadesimal float = %a%n", 20.11);

        System.out.println("\n==== FORMAT TEKS ====");
        System.out.printf("String = %s", "kurumi tokisaki");
        System.out.printf("%nchar = %c", 'A');
        System.out.printf("%nboolean = %b%n", true);

        System.out.println("\npenggunaan lainnya = %% untuk mencetak simbol % dan %n untuk newline atau baris baru\n");

        System.out.println("==== FORMAT TANGGAL WAKTU ====\n");
        /*
        1.5. Format Tanggal Waktu (%t)
        Dipakai untuk Date, Calendar, atau LocalDateTime.
        Spec	Arti	Output Contoh
        %tY	tahun (4 digit)	2025
        %ty	tahun (2 digit)	25
        %tm	bulan (01–12)	11
        %tB	nama bulan	November
        %td	tanggal	05
        %tA	nama hari	Thursday
        %ta	singkatan hari	Thu
        %tH	jam 00–23	14
        %tI	jam 01–12	02
        %tM	menit	50
        %tS	detik	33
        %tp	am/pm	pm
        %tD	mm/dd/yy	11/05/25
        %tF	yyyy-mm-dd	2025-11-05
        %tT	HH:mm:ss	14:50:33
        %tr	jam 12 format	02:50:33 PM
         */

        System.out.println("==== FLAGS (TINGKAH LAKU FORMAT) ====");
        /*
        -10 disini digunakan untuk membuat teksnya itu rata kiri atau seperti kita punya 10 indeks |k|u|r|u|m|i| | | | |. karena menggunakan -, kita isi dari kiri. karena yang di isi hanya 6 karakter dari 10 karakter sehingga tersisa 4 karakter kosong
         */
        System.out.printf("flag - = |%-10s|%n", "kurumi");
        /*
        disini hampir sama flag - tapi disini menambahkan 0 didepan angka yang ada. disini aku pakai 05, seperti kita punya indeks sebanyak 5 angka yang kita inputkan itu berada dibelakang. |0|0|0|3|3| jadi karena yang aku inputkan itu 33 hanya 2 karakter sehingga ada 3 karakter yang kosong itu di isi dengan angka 0.
         */
        System.out.printf("flag 0 = %05d%n", 33);
        /*
        menambahkan + didepan angka untuk menunjukkan bahwa angka tersebut positif bukan negatif
         */
        System.out.printf("flag + = %+d%n", 33);
        System.out.printf("flag spasi = % d%n", 33); // menyisakan spasi untuk angka posistif
        System.out.printf("flag ( = %(d%n", -33); // angka negatif jadi format kurung (akuntansi)
        System.out.printf("flag , = %,d%n", 1000000); // untuk menambahkan koma agar lebih mudah dibaca
        // format alternatif: %#x prefix 0x, %#o oktal tambah 0, %#f pastikan ada titik desimal
        System.out.printf("flag #x = %#x%n", 255);
        System.out.printf("flag #o = %#o%n", 33);
        System.out.printf("flag #f = %#f%n", 22.11);

        System.out.println("\n==== WIDTH (LEBAR MINIMAL) ====");
        System.out.printf("kolom lebar 10, isi rata kanan = |%10d|%n", 123);
        System.out.printf("kolom lebar 10, isi rata kiri = |%-10d|%n", 123);

        System.out.println("\n==== PRECISION ====");
        /*
        agar angka di belakang koma(, atau .) hanya 2 angka agar hasilnya lebih rapi
         */
        System.out.printf("precision = %.2f%n", 12.34566757);
        /*
        untuk membatasi panjang karakter. misalkan ada karakter dengan panjang 10 tapi kita batasi panjangnya 4 hasilnya hanya 4 karakter pertama saja yang akan ditampilkan
         */
        System.out.printf("membatasi panjang String = %.4s%n", "kurumi tokisaki");

        System.out.println("\n==== KOMBINASI PENGGUNAAN (FLAG + WIDTH + PRECISON) ====");
        System.out.printf("%+-10.2f%n", 12.347583838);

        System.out.println("\n==== REFERENSI ARGUMEN ====");
        /*
        contohnya %1$s yang dimana s adalah String sedangkan 1$ adalah argumen pertama yang akan ditampilkan sebelum 2$ karena itulah karena kurumi itu %1$s maka akan ditampilkan duluan sebelum %2$s java
         */
        System.out.printf("referensi argumen (n$) = %2$s loves %1$s%n", "Java", "Kurumi");

        System.out.println("\n==== LATIHAN REALISTIS (TABEL DATA) ====");
        System.out.printf("|%-12s|%8d|%12.2f|%n", "Nama", 20, 90.55);
        System.out.printf("|%-12s|%8d|%12.2f|%n", "Kurumi", 19, 88.2345);

        System.out.println("==== INFORMASI TAMBAHAN: SEMUA HAL YANG BISA DIPAKAI DI printf() ====");
        /*
        ✔ Format angka:
        integer (%d, %o, %x, %X)
        floating (%f, %e, %E, %g, %a)
        ✔ Format string: %s, %c, %b
        ✔ Format waktu: semua %t? seperti tabel di atas
        ✔ Format literal: %% (tanda persen) %n (newline)
        ✔ Flags lengkap: -, 0, +, ,, (, #, (space)
        ✔ Width: %5d, %10s, dll.
        ✔ Precision: %.2f, %.5s, dll.
        ✔ Argument index: %1$d, %2$s, dll.
         */

    }

}