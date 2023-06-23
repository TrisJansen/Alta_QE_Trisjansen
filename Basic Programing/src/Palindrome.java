import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Palindrome {
    private static int k;

    public static void main(String[] args) {
        String x,y = " ";
        Scanner a = new Scanner(System.in);
        System.out.println("Kata Dibalik Sama Saja");
        System.out.print("Masukan Kata: ");
        x = a.nextLine();
            int length = x.length();
        for(int k = length - 1; k >= 0; k--);{
            y =y + x.charAt (k);}
        if(x.equalsIgnoreCase (y)) {
            System.out.print("True");
        }else {
            System. out.print("False");
        }


    }
}