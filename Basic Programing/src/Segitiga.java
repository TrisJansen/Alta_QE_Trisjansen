import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mencari Luas segita dalam Cm");
        System.out.print("Masukan alas : ");
        float alas = input.nextFloat();
        System.out.println("Masukan Tinggi: ");
        float tinggi = input.nextFloat();
        float LuasSegitiga = (alas * tinggi) / 2;

        System.out.println("Luas Segitiga adalah : " + LuasSegitiga);

    }
}