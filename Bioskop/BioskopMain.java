import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BioskopMain {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();

        films.add(new Film("Nobody", "Action", 181, "15:00", 45000));
        films.add(new Film("Silence of the Lambs", "Horror", 104, "10:00", 35000));

        List<Pemesanan> semuaPemesanan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM PEMESANAN TIKET BIOSKOP ===");
            System.out.println("1. Tampilkan Jadwal Film");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Semua Pemesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch(pilihan) {
                case 1:
                    Film.tampilkanFilm(films);
                    break;
                case 2:
                    Pemesanan.prosesPemesanan(scanner, films, semuaPemesanan);
                    break;
                case 3:
                    Pemesanan.tampilkanSemuaPesanan(semuaPemesanan);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Input tidak valid!");
            }
        } while(pilihan != 4);

        scanner.close();
    }
}