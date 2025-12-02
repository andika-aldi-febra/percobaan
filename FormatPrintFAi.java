public class FormatPrintFAi {

    public static void main(String[] args) {

        System.out.println("\n" + "=".repeat(50));
        System.out.println("DEMO LENGKAP PRINTF FORMATTING");
        System.out.println("=".repeat(50));

        // ===== FORMAT ANGKA INTEGER =====
        System.out.println("\n--- FORMAT ANGKA INTEGER ---");
        System.out.printf("integer basis 10 = %d%n", 42);       // untuk bilangan desimal (byte, short, int, long)
        System.out.printf("oktal = %o%n", 10);                  // untuk bilangan oktal
        System.out.printf("hexadesimal lower = %x%n", 245);     // untuk bilangan hexadesimal lowercase
        System.out.printf("hexadesimal upper = %X%n", 245);     // untuk bilangan hexadesimal uppercase

        // ===== FORMAT ANGKA PECAHAN =====
        System.out.println("\n--- FORMAT ANGKA PECAHAN ---");
        System.out.printf("floating point = %f%n", 12.1);       // desimal biasa
        System.out.printf("scientific notation = %e%n", 12.3);  // notasi ilmiah kecil
        System.out.printf("SCIENTIFIC NOTATION = %E%n", 12.6);  // notasi ilmiah besar
        System.out.printf("otomatis pilih = %g%n", 13.23);      // otomatis pilih %f atau %e
        System.out.printf("hexadesimal float = %a%n", 20.11);   // hexadesimal float

        // ===== FORMAT TEKS =====
        System.out.println("\n--- FORMAT TEKS ---");
        System.out.printf("String = %s%n", "kurumi tokisaki");  // format string
        System.out.printf("char = %c%n", 'A');                  // format character
        System.out.printf("boolean = %b%n", true);              // format boolean

        System.out.println("\n--- SIMBOL KHUSUS ---");
        System.out.printf("simbol %% untuk mencetak persen%n");  // %% untuk simbol %
        System.out.printf("baris 1%nbaris 2%n");                // %n untuk newline

        // ===== FLAGS =====
        System.out.println("\n--- FLAGS (TINGKAH LAKU FORMAT) ---");
        // flag - : rata kiri dengan width 10
        System.out.printf("flag - = |%-10s|%n", "kurumi");
        // flag 0 : padding dengan nol, width 5  
        System.out.printf("flag 0 = %05d%n", 33);
        // flag + : menampilkan tanda positif
        System.out.printf("flag + = %+d%n", 33);
        // flag spasi : menyisakan spasi untuk angka positif
        System.out.printf("flag spasi = % d%n", 33);
        // flag ( : format akuntansi untuk angka negatif
        System.out.printf("flag ( = %(d%n", -33);
        // flag , : pemisah ribuan
        System.out.printf("flag , = %,d%n", 1000000);
        // flag # : format alternatif
        System.out.printf("flag #x = %#x%n", 255);  // hex dengan prefix 0x
        System.out.printf("flag #o = %#o%n", 33);   // oktal dengan prefix 0
        System.out.printf("flag #f = %#f%n", 22.11); // pastikan ada titik desimal

        // ===== WIDTH & PRECISION =====
        System.out.println("\n--- WIDTH (LEBAR MINIMAL) ---");
        System.out.printf("lebar 10, rata kanan = |%10d|%n", 123);
        System.out.printf("lebar 10, rata kiri  = |%-10d|%n", 123);

        System.out.println("\n--- PRECISION ---");
        System.out.printf("precision float = %.2f%n", 12.34566757);    // 2 digit desimal
        System.out.printf("precision string = %.4s%n", "kurumi tokisaki"); // batasi 4 karakter

        // ===== FITUR LANJUTAN =====
        System.out.println("\n--- KOMBINASI & ARGUMENT INDEX ---");
        System.out.printf("kombinasi = %+-10.2f%n", 12.347583838);  // flag + width + precision
        System.out.printf("argument index = %2$s loves %1$s%n", "Java", "Kurumi"); // %2$s = argumen ke-2

        // ===== CONTOH REALISTIS =====
        System.out.println("\n--- CONTOH TABEL DATA ---");
        System.out.printf("|%-12s|%8s|%12s|%n", "NAMA", "USIA", "NILAI");
        System.out.println("|------------|--------|------------|");
        System.out.printf("|%-12s|%8d|%12.2f|%n", "Kurumi", 19, 88.2345);
        System.out.printf("|%-12s|%8d|%12.2f|%n", "John", 20, 90.55);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("SEMUA FORMAT TELAH DICOBA!");
        System.out.println("=".repeat(50));

    }

}