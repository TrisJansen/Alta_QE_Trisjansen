// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class angka {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("==Hallo, Selamat datang di hitungan kita==");
        System.out.println("");
        Kalkulator Kalkulator = new Kalkulator();
        penjumlahan penjumlahan = new penjumlahan(3,4 );
        System.out.println("3 + 4 =" + penjumlahan.Penjumlahan());
        pengurangan pengurangan = new pengurangan(15,4);
        System.out.println("15 - 4 =" + pengurangan.Pengurangan());
        perkalian perkalian = new perkalian(10,10);
        System.out.println("10 X 10 =" + perkalian.Perkalian());
        pembagian pembagian = new pembagian(12,3);
        System.out.println("12 : 3 = " + pembagian.Pembagian());





    }
}