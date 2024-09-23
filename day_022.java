package day22;


public class Day22 {

   
    public static void main(String[] args) {
        // deklarasi 5 variabel dengan tipe referensi integer
        Integer angka1 = 10;
        Integer angka2 = 20;
        Integer angka3 = 30;
        Integer angka4 = 40;
        Integer angka5 = 50;
        
        // penambahan semua variabel
        Integer hasilpenambahan = angka1 + angka2 + angka3 + angka4 + angka5 ;
        System.out.println("hasil penambahan: " + hasilpenambahan);
        
        //pengurangan semua variabel
        Integer hasilpengurangan = angka1 - angka2 - angka3 - angka4 - angka5;
        System.out.println("hasil pengurangan: " + hasilpengurangan);
        
        //mengubah nilai beberapa variabel
        angka1 = 15;
        angka2 = 25;
        System.out.println("angka1 sekarang: " + angka1);
        System.out.println("angka2 sekarang: " + angka2);
        
        //penambahan setelah perubahan nilai variabel
        hasilpenambahan = angka1 + angka2 + angka3 + angka4 + angka5;
        System.out.println("hasil penambahan setelah perubahan: " + hasilpenambahan);
        
        //pengurangan setelah perubahan nilai variabel
        hasilpengurangan = angka1 - angka2 - angka3 - angka4 - angka5;
        System.out.println("hasil pengurangan setelah perubahan: " + hasilpengurangan);
        
        //operasi penambahan dan pengurangan variabel secara bertahap
        angka3 += 10;
        angka4 -= 5;
        System.out.println("angka3 setelah ditambah 10:" + angka3);
        System.out.println("angka4 setelah dikurangi 5:" + angka4);
        
        //penambahan akhir dan pengurangan
        hasilpenambahan = angka1 + angka2 + angka3 + angka4 + angka5;
        System.out.println("hasil penambahan akhir: " + hasilpenambahan);
        
        hasilpengurangan = angka1 - angka2 - angka3 - angka4 - angka5;
        System.out.println("hasil pengurangan akhir: " + hasilpengurangan);
        
        
        
        
        
    }
    
}
