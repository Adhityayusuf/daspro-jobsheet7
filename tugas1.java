import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hrgTiket = 50000, totalHarga = 0, harga = 0, diskon;
        int totalTiket = 0, tiket, i = 0;

        do { 
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + (i + 1) + " adalah: ");
            tiket = sc.nextInt();
            if (tiket == 0) {
                break;
            }
            if (tiket < 0) {
                System.out.println("jumlah tiket tidak valid!");
                continue;
            } else if (tiket > 4 && tiket <= 10) {
                diskon = (tiket * hrgTiket) * 0.1;
                harga = (tiket * hrgTiket) - diskon;
            } else if (tiket > 10) {
                diskon = (tiket * hrgTiket) * 0.15;
                harga = (tiket * hrgTiket) - diskon;
            } else if (tiket > 0 && tiket <= 4) {
                harga = tiket * hrgTiket;
            }
            totalHarga += harga;
            totalTiket += tiket;
            i++;
        } while (true);
        System.out.println("Total keseluruhan Harga : " + totalHarga);
        System.out.println("Total Keseluruhan Tiket : " + totalTiket);
    }
}
