import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas1No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah bilangan: ");
        int n = sc.nextInt();
        sc.nextLine();

        int BilanganBulat = 0;
        int BilanganDesimal = 0;
        int i = 0;

        while (i < n) {
            try {
                System.out.print("Input bilangan ke-"  + (i + 1 ) + ": ");
                Double bilangan = sc.nextDouble();

                if (bilangan % 1 == 0) {
                    BilanganBulat++;
                } else {
                    BilanganDesimal++;
                }
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka");
                sc.nextLine();
                
            }
        }
        System.out.println(BilanganBulat + " Bilangan Bulat");
        System.out.println(BilanganDesimal + " Bilangan Desimal");
        sc.close();
    }
}
