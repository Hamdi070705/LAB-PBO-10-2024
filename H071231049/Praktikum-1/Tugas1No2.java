import java.util.Scanner;

public class Tugas1No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input kalimat: ");
        String kalimat = sc.nextLine();
        String hurufkecil = kalimat.toLowerCase();
        sc.close();

        String[] kata = hurufkecil.split("\\s+");
        StringBuilder hasil = new StringBuilder();

        for (String huruf : kata){
            hasil.append(Character.toUpperCase(huruf.charAt(0)));
            hasil.append(huruf.substring(1)).append(" ");
        }
        System.out.println("Hasil: " + hasil.toString().trim());
      
    }
}
