package day15;


public class Day15 {

    
    public static void main(String[] args) {
        double var1, var2, var3, var4, var5;
        
        var1 = 12.1234567;
        var2 = 23.7654321;
        var3 = 34.9876543;
        var4 = 45.8765432;
        var5 = 56.3456789;
        
        System.out.printf("var1: %.1f\n", var1);
        System.out.printf("var2: %.2f\n", var2);
        System.out.printf("var3: %.3f\n", var3);
        System.out.printf("var4: %.4f\n", var4);
        System.out.printf("var5: %.5f\n", var5);
        
        double var6 = 123.12345678901;
        double var7 = 234.23456789012;
        double var8 = 345.34567890123;
        double var9 = 456.45678901234;
        double var10 = 567.56789012345;
        double var11 = 678.67890123456;
        double var12 = 789.78901234567;
        double var13 = 890.89012345678;
        double var14 = 901.90123456789;
        
        System.out.println(String.format("var6: %.7f", var6));
        System.out.println(String.format("var7: %.7f", var7));
        System.out.println(String.format("var8: %.7f", var8));
        System.out.println(String.format("var9: %.7f", var9));
        System.out.println(String.format("var10: %.7f", var10));
        System.out.println(String.format("var11: %.7f", var11));
        System.out.println(String.format("var12: %.7f", var12));
        System.out.println(String.format("var13: %.7f", var13));
        System.out.println(String.format("var14: %.7f", var14));
        
        double pi = 3.14;
        System.out.println(String.format("2 angka dibelakang koma = %.2f", pi));
        System.out.println(String.format("3 angka dibelakang koma = %.3f", pi));
        System.out.println(String.format("4 angka dibelakang koma = %.4f", pi));
        System.out.println(String.format("5 angka dibelakang koma = %.5f", pi));
        System.out.println(String.format("6 angka dibelakang koma = %.6f", pi));
        System.out.println(String.format("7 angka dibelakang koma = %.7f", pi));
        System.out.println(String.format("8 angka dibelakang koma = %.8f", pi));
        System.out.println(String.format("9 angka dibelakang koma = %.9f", pi));
        System.out.println(String.format("10 angka dibelakang koma = %.10f", pi));
        System.out.println(String.format("11 angka dibelakang koma = %.11f", pi));
        
        
        
        
        
    }
    
}
