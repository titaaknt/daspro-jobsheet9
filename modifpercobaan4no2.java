import java.util.Scanner;

public class modifpercobaan4no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input banyaknya nilai
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        
        // Inisialisasi array dengan ukuran yang diinput
        int[] arrNilai = new int[jumlahNilai];

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1; // Inisialisasi hasil dengan -1 jika tidak ditemukan

        // Mencari nilai
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1; // Menyimpan posisi (1-indexed)
                break;
            }
        }

        // Menampilkan hasil
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
