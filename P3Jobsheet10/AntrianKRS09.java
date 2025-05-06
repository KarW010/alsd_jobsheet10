package P3Jobsheet10;

public class AntrianKRS09 {
    MahasiswaKRS09[] data;
    int front, rear, size, max;
    int totalDilayani = 0;

    public AntrianKRS09(int max) {
        this.max = max;
        data = new MahasiswaKRS09[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambah(MahasiswaKRS09 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void layani2Mahasiswa() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2. Tidak bisa melayani.");
            return;
        }
        System.out.println("Melakukan proses KRS untuk:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahSudahDilayani() {
        return totalDilayani;
    }

    public int jumlahBelumDilayani() {
        return max * 3 - totalDilayani;
    }
}
