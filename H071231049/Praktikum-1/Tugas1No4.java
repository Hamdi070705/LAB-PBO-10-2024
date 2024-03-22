import java.util.Scanner;
public class Tugas1No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan nilai jari-jari Lingkaran: ");
            double r = sc.nextDouble();

            if (r < 0){
                System.out.println("Jari-jari tidak boleh negatif");
                return;
            }
            
            double luas = Math.PI * r * r;
            System.out.printf("Luas lingkaran adalah: %.2f\n", luas);
        }
        catch (Exception e) {
            System.out.println("Input harus berupa angka: ");
        } finally {
            sc.close();
        }
    } 
}
