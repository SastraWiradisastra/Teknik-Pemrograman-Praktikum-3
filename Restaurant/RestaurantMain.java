import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.tambahMenuMakanan("Bala-bala", 1_000, 20);
        restaurant.tambahMenuMakanan("Gehu", 1_000, 20);
        restaurant.tambahMenuMakanan("Tahu", 1_000, 0);
        restaurant.tambahMenuMakanan("Molen", 1_000, 20);

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Menu Makanan");
            System.out.println("2. Pesan Makanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch(pilihan) {
                case 1:
                    System.out.println("\nDAFTAR MENU:");
                    restaurant.tampilMenuMakanan();
                    break;

                case 2:
                    System.out.print("\nMasukkan nama makanan: ");
                    String namaMakanan = scanner.nextLine();
                    System.out.print("Masukkan jumlah pesanan: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    restaurant.pesanMakanan(namaMakanan, jumlah);
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 3);

        scanner.close();
    }
}