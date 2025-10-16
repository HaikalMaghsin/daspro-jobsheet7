    import java.util.Scanner; 
    public class SiakadWhile13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int nilai, jml, i = 0;
            System.out.print("Masukkan jumlah mahasiswa: ");
            jml = sc.nextInt();
            while (i < jml) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai = sc.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid! Masukan lagi nilai yang valid");
                    continue;
                } else if (nilai >= 85) {
                    System.out.println("Nilai huruf: A");
                    System.out.println("Bagus, pertahankan nilainya");
                } else if (nilai >= 70) {
                    System.out.println("Nilai huruf: B");
                } else if (nilai >= 55) {
                    System.out.println("Nilai huruf: C");
                } else if (nilai >= 40) {
                    System.out.println("Nilai huruf: D");
                } else {
                    System.out.println("Nilai huruf: E");
                }
                i++;
            }
            sc.close();
            System.out.println("\nInput nilai selesai. Terima kasih!");
        }
    }
