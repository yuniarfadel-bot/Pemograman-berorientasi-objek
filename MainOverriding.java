// 1. KELAS INDUK (Superclass)
class Kendaraan {
    // Method dasar di kelas induk
    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak dari satu tempat ke tempat lain...");
    }
}

// 2. KELAS ANAK (Subclass)
class Mobil extends Kendaraan {
    // Overriding: Menulis ulang method bergerak() dari kelas Kendaraan
    // @Override adalah anotasi opsional, tapi sangat disarankan agar kita tahu ini hasil overriding
    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak maju menggunakan 4 roda dan mesin bensin.");
    }
}

// 3. KELAS UTAMA (Main Class)
// Ingat: Simpan file ini dengan nama MainOverriding.java
public class MainOverriding {
    public static void main(String[] args) {
        
        System.out.println("--- Objek Kendaraan ---");
        Kendaraan kendaraanUmum = new Kendaraan();
        kendaraanUmum.bergerak(); // Akan memanggil method dari kelas Kendaraan
        
        System.out.println("\n--- Objek Mobil ---");
        Mobil mobilKu = new Mobil();
        mobilKu.bergerak(); // Akan memanggil method yang sudah di-override di kelas Mobil
        
        System.out.println("\n--- Polimorfisme (Bentuk Lanjut Overriding) ---");
        Kendaraan kendaraanMisterius = new Mobil();
        kendaraanMisterius.bergerak(); // Tetap memanggil method dari kelas Mobil karena wujud aslinya adalah Mobil
    }
}