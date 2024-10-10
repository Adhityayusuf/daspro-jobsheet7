import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0, i = 1;
        
        do { 
            System.out.print("Masukkan jenis kendaraan (1.Mobil, 2.Motor, 0.keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1) {
                System.out.print("Masukkan durasi waktu: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (durasi <= 5) {
                    total += (durasi * 3000);
                }
            }
            if (jenis == 2) {
                System.out.print("Masukkan durasi waktu: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (durasi <= 5) {
                    total += (durasi * 2000);
                }
            }
            
        } while (jenis != 0);

        System.out.println("Total keseluruhan penghasilan: " + total);
    }
}
