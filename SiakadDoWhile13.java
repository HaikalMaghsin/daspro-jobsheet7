import java.util.Scanner;
public class SiakadDoWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;
        System.out.println("=== Program Transaksi Kafe ===");
        do {
            System.out.print("\nMasukkan nama pelanggan (atau ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah kopi yang dibeli: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh yang dibeli: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti yang dibeli: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            System.out.println("\n--- Struk Pembelian ---");
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("Total Pembelian: Rp " + totalHarga);
            System.out.println("------------------------");
            sc.nextLine();

        } while (true);
        System.out.println("Terima kasih telah berbelanja di Kafe Kami!\n");
        sc.close();
    }
}
