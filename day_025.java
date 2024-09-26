package day25;



public class Day25 {
    public static void main(String[] args) {
        // Deklarasi variabel reference Double
        Double angka1 = 10.5;
        Double angka2 = 20.5;
        Double angka3 = 15.0;
        Double angka4 = 5.5;
        Double angka5 = 30.0;

        // Tampilkan nilai awal
        System.out.println("Nilai angka1: " + angka1);
        System.out.println("Nilai angka2: " + angka2);
        System.out.println("Nilai angka3: " + angka3);
        System.out.println("Nilai angka4: " + angka4);
        System.out.println("Nilai angka5: " + angka5);

        // Operasi penambahan
        Double hasilPenambahan = penambahan(angka1, angka2, angka3);
        System.out.println("Hasil penambahan angka1, angka2, angka3: " + hasilPenambahan);

        // Operasi pengurangan
        Double hasilPengurangan = pengurangan(angka5, angka4, angka1);
        System.out.println("Hasil pengurangan angka5, angka4, angka1: " + hasilPengurangan);
    }

    // Metode penambahan
    public static Double penambahan(Double a, Double b, Double c) {
        return a + b + c;
    }

    // Metode pengurangan
    public static Double pengurangan(Double a, Double b, Double c) {
        return a - b - c;
    }
    
}
