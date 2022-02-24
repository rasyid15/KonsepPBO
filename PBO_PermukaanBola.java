
package pbo_muhammad_rasyid_ridho;
import java.util.Scanner;
public class PBO_PermukaanBola {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double luas = 0;
        System.out.print("Masukkan nilai jari jari bola : ");
        int r = input.nextInt();
        luas = 4*22/7*r*r;
        System.out.println("Luas Permukaan Bola : "+luas);
        
    } 
}
