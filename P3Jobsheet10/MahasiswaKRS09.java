package P3Jobsheet10;

public class MahasiswaKRS09 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public MahasiswaKRS09(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
