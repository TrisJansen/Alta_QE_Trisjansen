import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil = 0;
        double rata_rata;
            System.out.println("input jumlah array: ");
            int jumlah = input.nextInt();
            int i[];
            int y;
            i = new int[jumlah];
            System.out.println("input nilai array");
            for (int y = 0; y < jumlah; y++) {
                System.out.print("nilai array("+(y+1)+")=");
                i[y] =input.nextInt();
            }
            for (int t = 0; t<i.length;t++) {
                hasil = hasil + i[y];
            }
            rata_rata = hasil / i.length;
            System.out.println("mean nya adalah :"+String.valueOf(rata_rata));

        }
    }

