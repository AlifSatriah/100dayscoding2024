package day20;


public class Day20 {

    
    public static void main(String[] args) {
       //deklarasi variabel menggunakan tipe data byte
       Byte ali = Byte.valueOf((byte) 20);
       Byte budi = Byte.valueOf((byte)15);
       Byte cici = Byte.valueOf((byte)18);
       byte dedi = Byte.valueOf((byte)22);
       byte evi = Byte.valueOf((byte)17);
       
       //menampilkan jumlah kelereng sebelum pertukaran
        System.out.printf("sebelum pertukaran: \n");
        System.out.printf("ali memiliki %d kelereng.\n", ali);
        System.out.printf("budi memiliki %d kelereng.\n", budi);
        System.out.printf("cici memiliki %d kelereng.\n", cici);
        System.out.printf("dedi memiliki %d kelereng.\n", dedi);
        System.out.printf("evi memiliki %d kelereng.\n", evi);
        
        //pertukaran kelereng anatara ali dan budi
        byte temp = ali;
        ali = budi;
        budi = temp;
        
        // pertukaran kelereng antara cici dan dedi
        temp = cici;
        cici = dedi;
        dedi = temp;
        
        // menambahkan jumlah kelereng
        ali = Byte.valueOf((byte)(ali + 5)); //ali mendapat tambahan 5 kelereng
        budi = Byte.valueOf((byte)(budi + 3)); //budi mendapat tambahan 3 kelereng
        cici = Byte.valueOf((byte)(cici + 2)); //cici mendapat tambahan 2 kelereng
        dedi = Byte.valueOf((byte)(dedi + 4)); //dedi mendapat tambahan 4 kelereng
        //evi tidak menambah kelereng
        
        //menampilkan jumlah kelereng setetlah  pertukaran dan penambahan
        System.out.println("setelah pertukaran dan penambahan kelereng:");
        System.out.printf("ali memiliki %d kelereng.\n", ali);
        System.out.printf("budi memiliki %d kelereng.\n", budi);
        System.out.printf("cici memiliki %d kelereng.\n", cici);
        System.out.printf("dedi memiliki %d kelereng.\n", dedi);
        System.out.printf("evi memiliki %d kelereng.\n", evi);
         
        
        
        
               
    }
    
}


       

        
               
 
