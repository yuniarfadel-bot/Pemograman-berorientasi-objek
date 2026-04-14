class Matematika {
    // Method pertama: Mengalikan 2 angka bulat (integer)
    public int kalikan(int a, int b) {
        return a * b;
    }

    // Method kedua (Overloading): Nama sama, tapi untuk 3 angka bulat
    public int kalikan(int a, int b, int c) {
        return a * b * c;
    }

    // Method ketiga (Overloading): Nama sama, tapi untuk angka desimal (double)
    public double kalikan(double a, double b) {
        return a * b;
    }
}

// Simpan dengan nama file: MainOverloading.java
public class MainOverloading {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        
        System.out.println("Hasil kali 2 angka (int)    : " + math.kalikan(4, 5));
        System.out.println("Hasil kali 3 angka (int)    : " + math.kalikan(2, 3, 4));
        System.out.println("Hasil kali 2 angka (double) : " + math.kalikan(2.5, 4.0));
    }
}