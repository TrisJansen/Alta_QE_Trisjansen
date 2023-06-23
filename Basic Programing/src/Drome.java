import java.util.Scanner;

public class Drome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Konversi Nilai Mahasiswa Universitas Maju Jaya");
        System.out.print("nama: ");
        String nama = input.nextLine();
        System.out.print("jurusan: ");
        String Jurusan = input.nextLine();
        Integer nilai;
        input = new Scanner(System.in);
        System.out.print("Input Nilai Anda: ");
        nilai = input.nextInt();
        if (nilai >= 80 && nilai < 100) {
            System.out.println("Grade : A");
        } else {
            if (nilai >= 65 && nilai < 79) {
                System.out.println("Grade : B+");
            } else {
                if (nilai >= 50 && nilai < 64) {
                    System.out.println("Grade : B");
                } else {
                    if (nilai >= 35 && nilai < 49) {
                        System.out.println("Grade : C");
                    } else {
                        if (nilai < 34) ;
                        {
                            System.out.println("Grade : D");
                            if ((nilai <0 ) & (nilai >100)){
                                System.out.println("Invald");
                            }

                        }

                    }
                }
            }
        }
    }
    }