import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    String jenisPekerjaan;

    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Pengalaman kerja: " + jenisPekerjaan);
    }

    public void tambahPengalaman() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pengalaman sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja tetap");
        System.out.println("4. Tidak ada");

        try {
            System.out.print("Input: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    jenisPekerjaan = "Freelancer";
                    
                    break;
                case 2:
                    jenisPekerjaan = "Magang";
                    break;
                case 3:
                    jenisPekerjaan = "Pekerja tetap";
                    break;
                case 4:
                    jenisPekerjaan = "Tidak ada";
                    break;
                default:
                    System.out.println("Input tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Inputan harus berupa integer.");
        }
    }
}
