import java.util.Scanner;

public class SurveiKepuasan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        
        System.out.println("=== SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Skala penilaian: 1-5");
        System.out.println("(1=Sangat Tidak Puas, 5=Sangat Puas)\n");
        
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("  Pertanyaan " + (j+1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
                
                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.print("  Input tidak valid! Masukkan nilai 1-5: ");
                    survei[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }
        
        System.out.println("\n=== HASIL SURVEY ===");
        System.out.print("Responden\t");
        for (int j = 0; j < survei[0].length; j++) {
            System.out.print("P" + (j+1) + "\t");
        }
        System.out.println();
        System.out.println("=".repeat(65));
        
        for (int i = 0; i < survei.length; i++) {
            System.out.print((i+1) + "\t\t");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print(survei[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < survei.length; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalPerResponden += survei[i][j];
            }
            double rataResponden = totalPerResponden / survei[i].length;
            System.out.printf("Responden %d: %.2f\n", (i+1), rataResponden);
        }
        
       
        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < survei[0].length; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPerPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPerPertanyaan / survei.length;
            System.out.printf("Pertanyaan %d: %.2f\n", (j+1), rataPertanyaan);
        }
       
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double totalKeseluruhan = 0;
        int jumlahData = 0;
        
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalKeseluruhan += survei[i][j];
                jumlahData++;
            }
        }
        
        double rataKeseluruhan = totalKeseluruhan / jumlahData;
        System.out.printf("Rata-rata kepuasan keseluruhan: %.2f\n", rataKeseluruhan);
        
        System.out.println("\n=== INTERPRETASI ===");
        if (rataKeseluruhan >= 4.0) {
            System.out.println("Kepuasan pelanggan: SANGAT BAIK");
        } else if (rataKeseluruhan >= 3.0) {
            System.out.println("Kepuasan pelanggan: BAIK");
        } else if (rataKeseluruhan >= 2.0) {
            System.out.println("Kepuasan pelanggan: CUKUP");
        } else {
            System.out.println("Kepuasan pelanggan: PERLU DITINGKATKAN");
        }
        
        sc.close();
    }
}