
package pbo_muhammad_rasyid_ridho;
import java.util.Scanner;
public class PBO_5 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO : ");
        nilai = input.nextInt();
        if(nilai<70)
        System.out.println("Siswa tidak lulus");
        if(nilai>70)
        System.out.println("Siswa lulus");
        
    }
    
}
