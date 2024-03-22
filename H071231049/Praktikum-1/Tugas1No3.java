import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Tugas1No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal: ");
        String tanggal = sc.nextLine();
        
        String output = convertStringDate(tanggal);

        System.out.println("Hasil: " + output);
        
        sc.close();
    }

    public static String convertStringDate(String input) {
            try {
                SimpleDateFormat sdfInput = new SimpleDateFormat("dd-MM-yy", Locale.getDefault());
                Date date = sdfInput.parse(input);
    
                SimpleDateFormat sdfOutput = new SimpleDateFormat("d MMMM yyyy");
                return sdfOutput.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
                return "Tanggal yang anda masukkan invalid, mohon masukkan tanggal yang benar";
            }
            
    }
}