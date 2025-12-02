public class KonversiTipeDataNumber {

    static void main(String[] args) {

        byte iniByte = 100;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        System.out.println("setelah di konversi: " + iniDouble);

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniInt2;

        System.out.println("setelah di konversi: " + iniByte2);

    }

}
