
package pbo_muhammad_rasyid_ridho;
import java.util.Scanner;
public class PBO_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai WEB : ");
        int nilai = input.nextInt();
        if(nilai >= 90)
            System.out.println("Nilai A");
        else if(nilai >= 75)
            System.out.println("Nilaii B");
        else if(nilai >= 50)
            System.out.println("Nilai C");
        else if(nilai >= 35)
            System.out.println("Nilai D");
        else
            System.out.println("Nilai E");
    }
    
}
