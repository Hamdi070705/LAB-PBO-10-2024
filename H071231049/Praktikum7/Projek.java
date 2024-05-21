import java.util.Scanner;

public class Projek {
    int jumlahProjek;

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    public void setJumlahProjek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    public void tambahProjek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");

        try {
            System.out.print("Input: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    jumlahProjek = 4;
                    break;
                case 2:
                    jumlahProjek = 8;
                    break;
                case 3:
                    jumlahProjek = 12;
                    break;
                case 4:
                    jumlahProjek = 16;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Inputan harus berupa integer.");
        }
    }
}
