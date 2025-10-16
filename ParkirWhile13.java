import java.util.Scanner;
public class ParkirWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;
        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        System.out.println("=== Program Perhitungan Parkir ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");
        do {
            System.out.print("\nMasukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                break;
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) { 
                total += durasi * tarifMobil;
            } else if (jenis == 2) { 
                total += durasi * tarifMotor;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
            }
        } while (jenis != 0);
        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);
        System.out.println("Terima kasih telah menggunakan layanan parkir kami!");
        sc.close();
    }
}
