import java.util.Scanner;

public class UbahStatementLangkah6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println("Mahasiswa yang lulus:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
            }
        }
    }
}
