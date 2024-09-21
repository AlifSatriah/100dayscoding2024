package day20;


public class Day20 {

    
    public static void main(String[] args) {
       //deklarasi variabel menggunakan tipe data byte
       byte ali = 20;
       byte budi = 15;
       byte cici = 18;
       byte dedi = 22;
       byte evi = 17;
       
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
        ali += 5; //ali mendapat tambahan 5 kelereng
        budi += 3; //budi mendapat tambahan 3 kelereng
        cici += 2; //cici mendapat tambahan 2 kelereng
        dedi += 4; //dedi mendapat tambahan 4 kelereng
        //evi tidak menambah kelereng
        
        //menampilkan jumlah kelereng setetlah  pertukaran dan penambahan
        System.out.println("setelah pertukaran dan penambahan kelereng:");
        System.out.println("ali memiliki" + ali + "kelereng.");
        System.out.println("budi memiliki" + budi + "kelereng.");
        System.out.println("cici memiliki" + cici + "kelereng.");
        System.out.println("dedi memiliki" + dedi + "kelereng.");
        System.out.println("evi memiliki" + evi + "kelereng.");
        
        
        
               
    }
    
}
