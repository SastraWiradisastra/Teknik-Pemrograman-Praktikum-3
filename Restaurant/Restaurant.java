import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Makanan> menuMakanan;

    public Restaurant() {
        this.menuMakanan = new ArrayList<>();
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        menuMakanan.add(new Makanan(nama, harga, stok));
    }

    public void tampilMenuMakanan() {
        for(Makanan makanan : menuMakanan) {
            if(!makanan.isOutOfStock()) {
                System.out.println(makanan.getNama() + "[" + makanan.getStok() + "]" +
                        "\tRp. " + makanan.getHarga());
            } else {
                System.out.println("Stok " + makanan.getNama() + " Habis!");
            }
        }
    }

    public void pesanMakanan(String namaMakanan, int jumlahPesanan) {
        boolean ditemukan = false;
        for(Makanan makanan : menuMakanan) {
            if(makanan.getNama().equalsIgnoreCase(namaMakanan)) {
                ditemukan = true;
                if(makanan.getStok() >= jumlahPesanan && jumlahPesanan > 0) {
                    makanan.kurangiStok(jumlahPesanan);
                    System.out.println("Pesanan berhasil! " + jumlahPesanan + " " + makanan.getNama());
                } else {
                    System.out.println("Gagal! Stok " + makanan.getNama() + " tersisa: " + makanan.getStok());
                }
            }
        }
        if(!ditemukan) {
            System.out.println("Makanan tidak ditemukan: " + namaMakanan);
        }
    }
}