import java.util.Scanner;
public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaBenar = 98;
        int tebakan=0;

        do {            
            System.out.print("Masukan tebakan angka antara 1-100 : ");
            tebakan = input.nextInt();
            if (tebakan < angkaBenar) {
                System.out.println("Tebakan anda terlalu kecil");
            } else if (tebakan > angkaBenar) {
                System.out.println("Tebakan anda terlalu besar");
            } else {
                System.out.println("Selamat, tebakan anda benar");
            }
        } while (tebakan != angkaBenar);
        
        
       tebakan++;
         System.out.println("Tebakan anda adalah "+tebakan);
    }
    
}
