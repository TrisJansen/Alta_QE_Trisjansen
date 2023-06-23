// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     volume volume = new volume(5,2,4);
     System.out.println("Dimensi Paket mu : " + volume.volume());
     double v = 0.025;
     double i = volume.volume();
     double a = 5000;

     double Harga = v*i*a;
     System.out.println("Harga Paket mu adalah: " + Harga);

        }

    }