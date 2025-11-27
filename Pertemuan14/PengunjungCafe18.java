public class PengunjungCafe18{

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String pengunjung : namaPengunjung) {  // Menggunakan for-each loop
            System.out.println("- " + pengunjung);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
