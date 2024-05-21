import java.util.Scanner;

public class Pendidikan {
    String jenjangPendidikan;

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }

    public void tambahPendidikan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        jenjangPendidikan = scanner.nextLine();
    }
}
