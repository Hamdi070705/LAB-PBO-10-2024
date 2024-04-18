package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        int attempt = 3;
        while (attempt != 0) {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            // TODO
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
            /*
             * Buatlah sebuah perkondisian (IF) yang akan
             * Mengecek apakah user index ke i dari listUser memiliki username yang sama
             * dengan username yang
             * diinput.
             * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
             * perulangan
             */
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            // TODO
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            /*
             *
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                
                // TODO
                showDetailUser(listUserProfile.get(userIndex));
                /*
                 *
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah, coba lagi");
                attempt --;
            }
        } else {
            System.out.println("Username tidak ditemukan, coba lagi");
            attempt --;
        }
    }
    System.out.println("-------------------------");
    System.out.println("Anda telah memasukkan username atau password yang salah beberapa kali, silakan coba lagi beberapa saat");
}

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password:
        // INPUT USERNAME
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        while (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong.");
            System.out.print("> ");
            username = sc.nextLine();
        }
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan.");
                showRegisterMenu();
                return;
            }
        }

        // INPUT PASSWORD
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        while (password.length() < 8) {
            System.out.println("Password harus memiliki minimal 8 karakter.");
            System.out.print("> ");
            password = sc.nextLine();
        }
        // TODO
        User user = new User(username, password);
        /*
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */

        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile();

        // Menginput Data Profile
        // INPUT NAMA LENGKAP
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        while (fullName.isEmpty()) {
            System.out.println("Nama lengkap tidak boleh kosong.");
            System.out.print("> ");
            fullName = sc.nextLine();
        }

        // INPUT UMUR
        System.out.println("Umur");
        System.out.print("> ");
        int age;
        while (true) {
            try {
                age = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Umur harus berupa angka.");
                System.out.print("> ");
                sc.nextLine();
            }
        }
        sc.nextLine();

        // INPUT HOBBY
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        while (hobby.isEmpty()) {
            System.out.println("Hobby tidak boleh kosong.");
            System.out.print("> ");
            hobby = sc.nextLine();
        }

        // TODO
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        /*
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */

        // TODO
        String nickName = StringUtils.getNickName(fullName);
        profile.setNickName(nickName);
        /*
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        // TODO
        System.out.println("--------------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("--------------------------------");
        System.out.println("Nama Lengkap   : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur           : " + profile.getAge());
        System.out.println("Hobby          : " + profile.getHobby());
        /*
         * Tampilkan semua data profile user yang login
         */
    }
}
