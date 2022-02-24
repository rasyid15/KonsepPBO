
package pbo_muhammad_rasyid_ridho;
import java.util.Scanner;
public class PBO_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai TPA :");
        int TPA = input.nextInt();
        System.out.print("Mauskan nilai Bahasa Inggris :");
        int BahasaInggris = input.nextInt();
        if((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat Beasiswa");
    }
    
}
