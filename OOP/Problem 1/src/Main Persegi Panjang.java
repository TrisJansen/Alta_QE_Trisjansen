// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main {
    public static void main(String[] args) {
        System.out.println("*Menghitung Luas & Keliling Sebuah Persegi Panjang*");
        System.out.println("=================");
        System.out.println("Diketahui bahwa ukuran sebuah Persegi Panjang adalah");
        System.out.println("panjang= 7 lebar= 8");
        System.out.println("Maka");


        persegiPanjang persegiPanjang = new persegiPanjang(7, 8);

        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        System.out.println("");
        System.out.println("Terimakasih :)");

    }
}