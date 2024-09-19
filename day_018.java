package day18;


public class Day18 {

    
    public static void main(String[] args) {
        //deklarasi dan inisialisasi boolean
        boolean isJavaFun = true;
        boolean isSkyBlue = true;
        boolean isNight = false;
        
        //menampilkan nilai boolean
        System.out.println("apakah belajar java menyenangkan? " + isJavaFun);
        System.out.println("apakah langit biru? " + isSkyBlue);
        System.out.println("apakah sekarang malam? " + isNight);
        
        //operasi logika AND
        boolean isFunAndSkyBlue = isJavaFun && isSkyBlue ;
        System.out.println("apakah belaja java menyenangkan dan langit biru? " + isFunAndSkyBlue);
        
        //operasi logika OR
        boolean isFunOrNight = isJavaFun || isNight;
        System.out.println("apakah belajar java menyenangkan atau sekarang malam? " + isFunOrNight);
        
        //operasi logika NOT
        boolean isNotNight = !isNight;
        System.out.println("apakah sekarang bukan malam? " + isNotNight);
        
        //boolean dari ekspresi komparasi
        int a = 10;
        int b = 5;
        boolean isAGreaterThanB = a > b;
        System.out.println("apakah a lebih besar dari b?" + isAGreaterThanB);
        boolean isAlessThanB = a < b;
        System.out.println("apakah a lebih kecil dari b? " + isAlessThanB);
        boolean isAEqualToB = a== b;
        System.out.println("apakah a sama dengan b?" + isAEqualToB);
        boolean isANotEqualToB = a != b;
        System.out.println("apakah a tidak sama dengan b?" + isANotEqualToB);
    }
    
}







