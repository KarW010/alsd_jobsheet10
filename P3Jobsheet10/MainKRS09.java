package P3Jobsheet10;

import java.util.Scanner;

public class MainKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS09 antrian = new AntrianKRS09(10);

        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong / Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Jumlah Antrian");
            System.out.println("9. Jumlah Mahasiswa yang sudah KRS");
            System.out.println("10. Mahasiswa belum melakukan KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS09 mhs = new MahasiswaKRS09(nim, nama, prodi, kelas);
                    antrian.tambah(mhs);
                    break;
                case 2:
                    antrian.layani2Mahasiswa();
                    break;
                case 3:
                    antrian.lihatDepan();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    System.out.println("Kosong: " + antrian.isEmpty());
                    System.out.println("Penuh : " + antrian.isFull());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Jumlah dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 9:
                    System.out.println("Sudah KRS: " + antrian.jumlahSudahDilayani());
                    break;
                case 10:
                    System.out.println("Belum KRS: " + antrian.jumlahBelumDilayani());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
