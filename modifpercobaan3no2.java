import java.util.Scanner;

public class modifpercobaan3no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Output header
        System.out.println("Team Teaching Dasar Pemrograman 2024");
        System.out.println("Politeknik Negeri Malang");
        System.out.println("Dasar Pemrograman 2024");
        
        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countLulus = 0;
        int countTidakLulus = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Hitung rata-rata lulus dan tidak lulus
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        // Hitung rata-rata
        double rataLulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rataTidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;

        // Tampilkan hasil
        System.out.printf("Rata-rata nilai lulus: %.2f%n", rataLulus);
        System.out.printf("Rata-rata nilai tidak lulus: %.2f%n", rataTidakLulus);
    }
}
