public class Makanan {
    private final String nama;
    private final double harga;
    private int stok;

    public Makanan(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public boolean isOutOfStock() {
        return (this.stok == 0);
    }

    public void kurangiStok(int jumlahPesanan) {
        this.stok -= jumlahPesanan;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
