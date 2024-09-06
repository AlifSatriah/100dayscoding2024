package day5;

public class Main {
    
    public static void main(String[] args) {
        //menggunakan println untuk mencetak teks ke layar dan otomatis menambahkan baris baru setelsh teks 
        //baris baru
        //output: alif satria
        System.out.println("alif satria");
        
        //print mencetak teks ke layar tanpa menambahkan baris barus setelahnya 
        // tidak ada baris baru 
        System.out.print("anak informatika ");
        
        //menggunakan printf untuk mencetak teks dengan format tertentu
        //%s digunakan untuk mencetak string %d digunakan untuk mencetak integer
        //%n digunakan untuk mencetak baris baru, tergantung pada sistem operasi
        int angka = 30;
        String nama = "alif";
        System.out.printf(" nama:%s,angka : %d%n", nama,angka);
        
        
        
    }
    
}
