
package pbo_muhammad_rasyid_ridho;
import java.util.Scanner;
public class PBO_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan batas bilangan : ");
        int batas = input.nextInt();
        int hasil = 0;
        for (int i = 1; i <= batas; i++)
            hasil += i;
        System.out.println("Total Jumlahnya adalah : "+hasil);
            
        
    }
    
}
