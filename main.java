import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Tiket Bioskop ===");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Lihat Daftar Tiket");
            System.out.println("3. Beli Tiket");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine(); // Membersihkan buffer
                    System.out.print("Film: ");
                    String film = scanner.nextLine();
                    System.out.print("Studio: ");
                    String studio = scanner.nextLine();
                    System.out.print("Jam Tayang: ");
                    String jamTayang = scanner.nextLine();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();

                    daftarTiket.add(new Tiket(film, studio, jamTayang, harga));
                    System.out.println("Tiket berhasil ditambahkan!");
                    break;

                case 2:
                    if (daftarTiket.isEmpty()) {
                        System.out.println("Tidak ada tiket yang tersedia.");
                    } else {
                        System.out.println("\n=== Daftar Tiket ===");
                        for (int i = 0; i < daftarTiket.size(); i++) {
                            System.out.println("Tiket #" + (i + 1));
                            daftarTiket.get(i).tampilkanInfo();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if (daftarTiket.isEmpty()) {
                        System.out.println("Tidak ada tiket yang tersedia untuk dibeli.");
                    } else {
                        System.out.println("\nPilih tiket yang ingin dibeli:");
                        for (int i = 0; i < daftarTiket.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            daftarTiket.get(i).tampilkanInfo();
                            System.out.println();
                        }
                        System.out.print("Masukkan nomor tiket: ");
                        int nomorTiket = scanner.nextInt();

                        if (nomorTiket > 0 && nomorTiket <= daftarTiket.size()) {
                            Tiket tiketDipilih = daftarTiket.get(nomorTiket - 1);
                            tiketDipilih.beliTiket();
                        } else {
                            System.out.println("Nomor tiket tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem tiket bioskop!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
