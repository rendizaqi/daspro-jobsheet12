import java.util.Scanner;

public class Kafe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah Anda member (true/false)? ");
        boolean isMember = sc.nextBoolean();

        System.out.print("Masukkan kode promo (jika ada): ");
        sc.nextLine();
        String kodePromo = sc.nextLine();

        Menu(namaPelanggan, isMember, kodePromo);

        System.out.print("\nBerapa banyak menu yang ingin Anda pesan? ");
        int jumlahMenu = sc.nextInt();

        int totalHarga = 0;
        for (int i = 1; i <= jumlahMenu; i++) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        }

        System.out.println("\nTotal harga untuk seluruh pesanan Anda: Rp " + totalHarga);

        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50% menggunakan kode promo: " + kodePromo);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% menggunakan kode promo: " + kodePromo);
        } else {
            System.out.println("Kode promo " + kodePromo + " tidak valid. Tidak ada pengurangan harga.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - 22,000");
        System.out.println("4. Teh Tarik - 12,000");
        System.out.println("5. Roti Bakar - 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu Anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            int diskon = (int) (hargaTotal * 0.50);
            hargaTotal -= diskon;
            System.out.println("Diskon 50% diterapkan! Diskon: Rp " + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            int diskon = (int) (hargaTotal * 0.30);
            hargaTotal -= diskon;
            System.out.println("Diskon 30% diterapkan! Diskon: Rp " + diskon);
        } else {
            System.out.println("Kode promo " + kodePromo + " tidak valid. Tidak ada pengurangan harga.");
        }

        return hargaTotal;
    }
}
