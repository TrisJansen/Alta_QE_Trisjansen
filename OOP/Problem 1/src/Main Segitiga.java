// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("*Menghitung Luas & Keliling Sebuah Segitiga*");
        System.out.println("=================");
        System.out.println("Diketahui bahwa ukuran sebuah segitiga adalah");
        System.out.println("alas= 3 tinggi= 4");
        System.out.println("Maka");

        Segitiga Segitiga = new Segitiga(3, 0, 0, 4);

        Segitiga.luasSegitiga();
        Segitiga.kelilingSegitiga();
        System.out.println("");
        System.out.println("Terimakasih :)");
    }
}