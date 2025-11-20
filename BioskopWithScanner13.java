import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;
        
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
            
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                
                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    // Validasi baris dan kolom
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia!");
                        continue;
                    }
                    
                    // Cek apakah kursi sudah terisi
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Maaf, kursi sudah terisi oleh " + 
                                         penonton[baris-1][kolom-1] + "!");
                        System.out.println("Silakan pilih kursi lain.");
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data berhasil diinput!");
                        break;
                    }
                }
                
            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i+1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
                
            } else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
                
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}
}