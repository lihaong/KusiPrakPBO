/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import FormPendaftaran.AndroidDev;
import FormPendaftaran.WebDev;
/**
 *
 * @author mfaja
 */
public class Main {
 
    
    static void inputForm(int opsi){
        Scanner input = new Scanner(System.in);
        double nilaiTulis, nilaiCoding, nilaiWawancara;
        String NIK, Nama;
        if(opsi == 1){
            System.out.println("\n|         Form Pendaftaran       |\n");
            System.out.print("Input NIK : ");
            NIK = input.nextLine();
            System.out.print("Input Nama : ");
            Nama = input.nextLine();
            System.out.print("Input Nilai Tes Tulis  : ");
            nilaiTulis = input.nextDouble();
            System.out.print("Input Nilai Tes Coding  : ");
            nilaiCoding = input.nextDouble();
            System.out.print("Input Nilai Tes Wawancara  : ");
            nilaiWawancara = input.nextDouble();
            
            AndroidDev AD = new AndroidDev( NIK,  Nama,  nilaiTulis,  nilaiCoding,  nilaiWawancara);
            AD.pembobotanNilaiTulis();
            AD.pembobotanNilaiCoding();
            AD.pembobotanNilaiWawancara();
            AD.hasilAkhir();
            
            subMenu(AD.getHasil(),AD.getNama(),opsi);
            
        } else {
            System.out.println("\n|         Form Pendaftaran       |\n");
            System.out.print("Input NIK : ");
            NIK = input.nextLine();
            System.out.print("Input Nama : ");
            Nama = input.nextLine();
            System.out.print("Input Nilai Tes Tulis  : ");
            nilaiTulis = input.nextDouble();
            System.out.print("Input Nilai Tes Coding  : ");
            nilaiCoding = input.nextDouble();
            System.out.print("Input Nilai Tes Wawancara  : ");
            nilaiWawancara = input.nextDouble();
            
            WebDev WD = new WebDev( NIK,  Nama,  nilaiTulis,  nilaiCoding,  nilaiWawancara);
            WD.pembobotanNilaiTulis();
            WD.pembobotanNilaiCoding();
            WD.pembobotanNilaiWawancara();
            WD.hasilAkhir();
            
            subMenu(WD.getHasil(),WD.getNama(),opsi);
        }
    }
    static void editForm(String Nama, int opsiDev){
        if (opsiDev == 1){
            Scanner input = new Scanner(System.in);
            double nilaiTulis, nilaiCoding, nilaiWawancara;
            System.out.println("    Form Edit  ");
            System.out.print("Input Nilai Tes Tulis  : ");
            nilaiTulis = input.nextDouble();
            System.out.print("Input Nilai Tes Coding  : ");
            nilaiCoding = input.nextDouble();
            System.out.print("Input Nilai Tes Wawancara  : ");
            nilaiWawancara = input.nextDouble();
            
            AndroidDev AD = new AndroidDev(Nama, nilaiTulis,nilaiCoding,nilaiWawancara);
            
            AD.pembobotanNilaiTulis();
            AD.pembobotanNilaiCoding();
            AD.pembobotanNilaiWawancara();
            AD.hasilAkhir();
            
            subMenu(AD.getHasil(),AD.getNama(),opsiDev);
            
        } else {
            Scanner input = new Scanner(System.in);
            double nilaiTulis, nilaiCoding, nilaiWawancara;
            System.out.println("    Form Edit  ");
            System.out.print("Input Nilai Tes Tulis  : ");
            nilaiTulis = input.nextDouble();
            
            System.out.print("Input Nilai Tes Coding  : ");
            nilaiCoding = input.nextDouble();
            System.out.print("Input Nilai Tes Wawancara  : ");
            nilaiWawancara = input.nextDouble();
            
            WebDev WD = new WebDev(Nama, nilaiTulis,nilaiCoding,nilaiWawancara);
            
            WD.pembobotanNilaiTulis();
            WD.pembobotanNilaiCoding();
            WD.pembobotanNilaiWawancara();
            WD.hasilAkhir();
            subMenu(WD.getHasil(),WD.getNama(),opsiDev);
            
        }
        
            
        
    }
    static void tampil (Double Hasil,String Nama,int opsiDev){
        if (opsiDev == 1){
            
            if (Hasil >= 85){
                System.out.println("Nilai Akhir : " + Hasil);
                System.out.println("SELAMAT " + Nama +" LOLOS Sebagai Android Developer");
            } else {
                System.out.println("Nilai Akhir : " + Hasil);
                System.out.println("MAAF " + Nama + " TIDAK LOLOS");
            }
        } else {
            
            if (Hasil >= 85){
                System.out.println("Nilai Akhir : " + Hasil);
                System.out.println("SELAMAT "+Nama + " LOLOS Sebagai Web Developer");
            } else {
                System.out.println("Nilai Akhir : " + Hasil);
                System.out.println("MAAF " +Nama+" TIDAK LOLOS");
            }
        }
        
            
        
    }
    static void subMenu(Double Hasil,String Nama,int opsiDev){
        int SubMenu;
        Scanner myOpsi = new Scanner(System.in);

        do{
            System.out.println("    Menu        ");
            System.out.println("    1. Edit");
            System.out.println("    2. Tampil");
            System.out.println("    3. Exit");
               System.out.print("    Pilih : ");
                        SubMenu = myOpsi.nextInt();
                        switch(SubMenu){
                            case 1:
                                editForm(Nama, opsiDev);
                            case 2:
                                tampil(Hasil,Nama,opsiDev);
                                break;
                            case 3:
                                System.exit(0);
                                break;
                        }
                                
            }while(SubMenu != 3);
    }
    
    static void menuUtama(){
        Scanner myOpsi = new Scanner(System.in);
        int opsiDev;
       
        
            System.out.println("\n+-------------------------------------------------+");
            System.out.println("|         Form Pendaftaran PT.FAJAR ANDIKHA       |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form: ");
            opsiDev = myOpsi.nextInt();
         
            switch(opsiDev){
                case 1:
                    inputForm(opsiDev);
                    
                    break;
                case 2:
                    inputForm(opsiDev);
                    
                    break;

                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuUtama();
        // TODO code application logic here
    }
    
}
