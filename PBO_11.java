
package pbo_muhammad_rasyid_ridho;
import java.util.Scanner;
public class PBO_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, total = 0, bil=7;
        while (bil!=0){
            a++;
            System.out.print("Masukan bilangan ke-"+a+" : ");
            bil = input.nextInt();
            total += bil;
        }
        System.out.print("Total jumlah "+(a-1)+"bilangan : ");
        System.out.println(total);
    }
    
}
