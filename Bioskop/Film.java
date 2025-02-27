import java.util.List;

public class Film {
    private final String judul;
    private final String genre;
    private final int durasi;
    private final String jadwal;
    private final double harga;

    public Film(String judul, String genre, int durasi, String jadwal, double harga) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.jadwal = jadwal;
        this.harga = harga;
    }

    public static void tampilkanFilm(List<Film> films) {
        System.out.println("\n=== DAFTAR FILM ===");
        for(int i = 0; i < films.size(); i++) {
            Film f = films.get(i);
            System.out.println((i + 1) + ". " + f.getJudul() +
                    " (" + f.getGenre() + ") " +
                    f.getDurasi() + " menit | " +
                    f.getJadwal() + " | Rp" + f.getHarga());
        }
    }

    public String getJudul() { return judul; }
    public String getGenre() { return genre; }
    public int getDurasi() { return durasi; }
    public String getJadwal() { return jadwal; }
    public double getHarga() { return harga; }
}