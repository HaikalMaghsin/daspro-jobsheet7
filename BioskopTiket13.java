import java.util.Scanner;
public class BioskopTiket13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPelanggan, jumlahTiket;
        double totalPenjualan = 0;
        final double hargaTiket = 50000;
        double totalHarga;
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + i);
            
            do {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
                    continue;
                }
                totalHarga = jumlahTiket * hargaTiket;
                if (jumlahTiket > 10) {
                    totalHarga *= 0.85;
                    System.out.println("Diskon 15% diterapkan.");
                } else if (jumlahTiket > 4) {
                    totalHarga *= 0.90;
                    System.out.println("Diskon 10% diterapkan.");
                } else {
                    System.out.println("Tidak ada diskon.");
                }
                System.out.println("Total harga: Rp " + totalHarga);
                totalPenjualan += totalHarga;
                break;
            } while (true);
        }
        System.out.println("\n=== RINGKASAN PENJUALAN HARIAN ===");
        System.out.println("Jumlah pelanggan hari ini : " + jumlahPelanggan);
        System.out.println("Total penjualan tiket     : Rp " + totalPenjualan);
        System.out.println("Terima kasih telah menggunakan sistem penjualan ini!");
        sc.close();
    }
}
