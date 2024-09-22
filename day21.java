package day21;


public class Day21 {

    
    public static void main(String[] args) {
        //deklarasi jumlah kelereng dengan tipe data short
        short ali = 20;
        short budi = 15;
        short cici = 18;
        short dedi = 22;
        short evi = 17;
        
        //output jumlah kelereng sebelum pertukaran menggunakan printf
        System.out.println("jumlah kelereng sebeleum pertukaran");
        System.out.printf("ali: %d\n", ali);
        System.out.printf("budi: %d\n", budi);
        System.out.printf("cici: %d\n", cici);
        System.out.printf("dedi: %d\n", dedi);
        System.out.printf("evi: %d\n", evi);
        
        //proses pertukaan kelereng (ali dengan budi, cici dan dedi)
        short temp = ali;
        ali = budi;
        budi = temp;
        
        temp = cici;
        cici = dedi;
        dedi = temp;
        
        //penmabahan jumlah kelereng 
        ali = (short) (ali + 5); //ali tambah 5
        budi = (short) (budi + 3); //budi tambah 3
        cici = (short) (cici + 2); //cici tambah 2
        dedi = (short) (dedi + 4); //dedi tambah 4
        evi = (short) (evi + 6); //evi tambah 6
        
        //output jumlah kelereng setelah pertukaran dan penambahan menggunakan println
        System.out.println("Jumlah kelereng setelah pertukaran dan penambahan:");
        System.out.println("ali: " + ali);
        System.out.println("Ali: " + budi);
        System.out.println("cici: " + cici);
        System.out.println("dedi: " + dedi);
        System.out.println("evi: " + evi);
        
    }
    
}
