// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main {
    public static void main(String[] args) {
        System.out.println("*Menghitung Luas & Keliling Sebuah Persegi*");
        System.out.println("=================");
        System.out.println("Diketahui bahwa ukuran sebuah Persegi adalah");
        System.out.println("sisi 4");
        System.out.println("Maka");
        Persegi Persegi = new Persegi(4);

        Persegi.luasPersegi();
        Persegi.kelilingPersegi();
        System.out.println("Terimakasih :)");



    }
}