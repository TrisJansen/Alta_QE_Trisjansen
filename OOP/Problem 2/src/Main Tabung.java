// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("*Menghitung Volume Sebuah Tabung*");
        System.out.println("=================");
        System.out.println("Diketahui bahwa ukuran sebuah Tabung adalah");
        System.out.println("alas= 7, Tinggi 10");
        System.out.println("Maka");
        Tabung Tabung= new Tabung(7,10);

        Tabung.volTabung();
        System.out.println("");
        System.out.println("Terimakasih :)");

        }

    }