import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    addProduct(products, sc);
                    break;
                case 2:
                    displayAllProducts(products);
                    break;
                case 3:
                    buyProduct(products, sc);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    
            }
        }
        
    }

    public static void addProduct(ArrayList<Product> products, Scanner scanner) {
        System.out.print("Masukkan nama produk: ");
        String brand = scanner.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double price = scanner.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double screenSize = scanner.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storageCapacity = scanner.nextInt();
                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ramSize = scanner.nextInt();
                System.out.print("Masukkan tipe prosesor: ");
                scanner.nextLine(); 
                String processorType = scanner.nextLine();
                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            case 3:
                System.out.print("Masukkan resolusi (MP): ");
                int resolution = scanner.nextInt();
                System.out.print("Masukkan tipe lensa: ");
                scanner.nextLine(); 
                String lensType = scanner.nextLine();
                products.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void displayAllProducts(ArrayList<Product> products) {
        System.out.println("Daftar Produk:");
        for (Product product : products) {
            product.displayInfo();
            System.out.println();
        }
    }

    public static void buyProduct(ArrayList<Product> products, Scanner scanner) {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seriesNumber = scanner.nextInt();
        boolean found = false;

        for (Product product : products) {
            if (product.seriesNumber == seriesNumber) {
                System.out.println("Anda telah membeli produk yang dibawah:");
                product.displayInfo();
                found = true;
                products.remove(product);
                break;
            }
        }

        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
        
    }
}
