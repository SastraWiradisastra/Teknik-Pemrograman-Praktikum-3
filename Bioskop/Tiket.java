public class Tiket {
    private final Film film;
    private final String nomorKursi;

    public Tiket(Film film, String nomorKursi) {
        this.film = film;
        this.nomorKursi = nomorKursi;
    }

    public Film getFilm() { return film; }
    public String getNomorKursi() { return nomorKursi; }
}