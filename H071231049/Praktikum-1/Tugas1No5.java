import java.util.Scanner;

public class Tugas1No5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan yang ingin dicari: ");
            int target = sc.nextInt();
            
            boolean found = false;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == target) {
                        System.out.printf("Found %d at [%d][%d]\n", target, i, j);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.printf("%d tidak ditemukan dalam array.\n", target);
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat.");
        } finally {
            sc.close();
        }
    }
}
