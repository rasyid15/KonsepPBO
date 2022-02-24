package pbo_muhammad_rasyid_ridho;

import java.util.Scanner;

public class PBO_Biodata {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, TLahir, AM, Motto;
        String bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String JenisK[] = {"Laki-Laki","Perempuan"};
        int NIS, TL, b, T, JK,tanggalLahir;

        System.out.println("BIODATA DIRI");
        System.out.print("Nama            :");
        nama = input.next();
        System.out.print("NIS             :");
        NIS = input.nextInt();
        System.out.print("Tempat Lahir    :");
        TLahir = input.next();
        System.out.println("Tanggal Lahir ");
       
        System.out.print("Tanggal         :");
        TL = input.nextInt();
        if(TL>31){
            System.out.println("Data Can't Find");
            System.exit(TL);
        }
        System.out.print("Bulan           :");
        b = input.nextInt();
        if(b>bulan.length){
            System.out.println("Data Can't Find");
            System.exit(b);
        } 
        System.out.print("Tahun           :");
        T = input.nextInt();
        if(T>2022){
            System.out.println("Data Can't Find");
            System.exit(T);
        } 
        System.out.print("Jenis Kelamin   :");
        JK = input.nextInt(JenisK.length);
        System.out.print("Alamat Malang   :");
        AM = input.next();
        System.out.print("Motto Hidup     :");
        Motto = input.next();
        System.out.println("==========================");
        System.out.println("Nama          :" + nama);
        System.out.println("NIS           :" + NIS);
        System.out.println("Tempat Lahir  :" + TLahir);
        System.out.println("Tanggal Lahir :"+ TL+" "+ bulan[b - 1]+" "+ T);
        System.out.println("jenis kelamin :"+ JenisK[JK - 1]);
        System.out.println("Alamat Malang :" + AM);
        System.out.println("Motto Hidup   :" +Motto);

    }

}
