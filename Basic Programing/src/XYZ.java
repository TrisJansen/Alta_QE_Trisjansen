import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class XYZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===xyz===");
        System.out.println("input height:");
        int tinggi = input.nextInt();
        polaXYZ(tinggi);
    }

    private static void polaXYZ(int height) {
        char[] simbol = {'X', 'Y', 'Z'};
        int symbolIndex = 0;

        for (int kolom = 0; kolom < height; kolom++) {
                System.out.println();
            for (int baris = 0; baris < height; baris++) {
                symbolIndex = symbolIndex +1;
                if ((symbolIndex) % 3 == 0) {
                    System.out.print("X ");
                } else if ((symbolIndex) % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }

        }
        System.out.println();
    }

}

