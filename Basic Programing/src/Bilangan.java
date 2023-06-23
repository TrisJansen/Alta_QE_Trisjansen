import java.util.Scanner;

    public class Bilangan {
        public static void main(String[] args) {
            System.out.println("Input Angka: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            for (int j=1; j<=n; j++){
                if(n%j==0){
                    System.out.println(n);
                }
            }
        }
}