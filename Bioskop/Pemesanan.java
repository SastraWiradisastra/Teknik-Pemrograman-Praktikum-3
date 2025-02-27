import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Pemesanan {
    private static int idCounter = 1;
    private String idPemesanan;
    private List<Tiket> tiket;
    private String tanggal;

    public Pemesanan(String tanggal) {
        this.idPemesanan = "TKT-" + idCounter++;
        this.tanggal = tanggal;
        this.tiket = new ArrayList<>();
    }

    public void tambahTiket(Tiket tiket) {
        this.tiket.add(tiket);
    }

    public void tampilkanDetail() {
        System.out.println("\n=== Detail Pemesanan ===");
        System.out.println("ID: " + idPemesanan);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Daftar Tiket:");

        for(Tiket t : tiket) {
            System.out.println("• " + t.getFilm().getJudul() +
                    " | Kursi: " + t.getNomorKursi() +
                    " | Harga: Rp" + t.getFilm().getHarga());
        }
    }

    public static void prosesPemesanan(Scanner scanner, List<Film> films, List<Pemesanan> semuaPemesanan) {
        Film.tampilkanFilm(films);
        System.out.print("\nPilih film (nomor): ");
        int pilihan = scanner.nextInt()-1;
        scanner.nextLine();

        if(pilihan < 0 || pilihan >= films.size()) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        Film filmTerpilih = films.get(pilihan);

        System.out.print("Masukkan nomor kursi: ");
        String kursi = scanner.nextLine();

        Tiket tiketBaru = new Tiket(filmTerpilih, kursi);
        Pemesanan pesanan = new Pemesanan(java.time.LocalDate.now().toString());
        pesanan.tambahTiket(tiketBaru);
        semuaPemesanan.add(pesanan);

        System.out.println("\nPemesanan berhasil!");
        pesanan.tampilkanDetail();
    }

    public static void tampilkanSemuaPesanan(List<Pemesanan> semuaPemesanan) {
        if(semuaPemesanan.isEmpty()) {
            System.out.println("\nBelum ada pemesanan!");
            return;
        }

        System.out.println("\n=== RIWAYAT PEMESANAN ===");
        for(Pemesanan p : semuaPemesanan) {
            p.tampilkanDetail();
        }
    }
}