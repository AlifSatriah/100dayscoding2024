package day16;


public class Day16 {

    
    public static void main(String[] args) {
        // deklarasi 4 variabel float tanpa inisialisasi
        float A1, A2, A3, A4;
        
        //deklarasi dan inisialisasi 4 variabel float
        float B1 = 1.5f;
        float B2 = 2.5f;
        float B3 = 3.5f;
        float B4 = 4.5f;
        System.out.printf("nilai awal B1 = %.2f, B2 = 5.2f, B3 = 5.2f, B4 = 5.2f\n", B1, B2, B3, B4);
        
        //update nilai A1-A4 dengan menukar nilai B1-B4
        A1 = B1;
        A2 = B2;
        A3 = B3;
        A4 = B4;
         System.out.println(String.format("setelah update A: A1 = %.2f, A2 = %.2f, A3 = %.2f, A4 = %.2f", A1, A2, A3, A4));
         
         //update nilai B1-B2
         B1 = 4.0f;
         B2 = 8.0f;
         B3 = 12.0f;
         B4 = 16.0f;
         System.out.println(String.format("setelah update B : B1 = %.2f, B2 = %.2f, B3 = %.2f, B4 = %.2f", B1, B2, B3, B4));
         
         //tukar nilai B.....
         float C = B1
         B1 = B3; // B1 = 12.0
         B3 = B4; // B2 = 4.0
         B4 = B2; // B3 = 16.0
         B2 = B1; // B4 = 8.0
         System.out.println(String.format("setelah penukaran B: B1 = %.2f, B2 = %.2f, B3 = %.2f, B4 = %.2f", B1, B2, B3, B4));
        
        
        
    }
    
}
