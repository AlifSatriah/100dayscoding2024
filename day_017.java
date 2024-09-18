package day17;


public class Day17 {

    
    public static void main(String[] args) {
        //deklarasi variabel char
        char huruf1 = 'A';
        char huruf2 = 'b';
        char simbol = '#';
        char angka = '5';
        
        //menampilkan karakter
        System.out.println("huruf pertama:" + huruf1);
        System.out.println("huruf kedua:" + huruf2);
        System.out.println("simbol:" + simbol);
        System.out.println("angka sebagai char:" + angka);
        
        //menampilkan nilai ASCII
        System.out.println("nilai ASCII huruf pertama:" + (int) huruf1);
        System.out.println("nilai ASCII huruf kedua:" + (int) huruf2);
        System.out.println("nilai ASCII simbol:" + (int) + simbol);
        System.out.println("nilai ASCII angka:" + (int) angka);
        
        //operasi penambahan pada char
        char huruf3 = (char) (huruf1 + 1); //menghasilkan karakter berikutnya
        System.out.println("huruf setelah '" + huruf1 + "'adalah" + huruf3);
        
        //pengrangan pada char
        char huruf4 =(char) (huruf2-1); //menghasilkn karakter sebelumnya
        System.out.println("huruf sebelum '" + huruf2 + "'adalah:" + huruf4);
        
        //mengubah huruf kecil menjadi besar
        char hurufbesar = Character.toUpperCase(huruf2);
        System.out.println("huruf besar dari'" + huruf2+ "'adalah:" + hurufbesar);
        
        //mengubah huruf besar menjadi kecil
        char hurufkecil = Character.toLowerCase(huruf1);
        System.out.println("huruf kecil dari'" + huruf1 + "'adalah:" + hurufkecil);
        
        
        
    }
    
}
