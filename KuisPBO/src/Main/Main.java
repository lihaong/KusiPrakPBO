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
        }
    }
    static void editForm(int opsiDev){
        if (opsiDev == 1){
            Scanner input = new Scanner(System.in);
            double nilaiTulis, nilaiCoding, nilaiWawancara;
            System.out.println("    Form Edit  ");
            System.out.print("Input Nilai Tes Tulis  : ");
            nilaiTulis = input.nextDouble();
            System.out.print("Input Nilai Tes Coding  : ");
            nilaiCoding = input.nextDouble();
            System.out.println(nilaiCoding);
            System.out.print("Input Nilai Tes Wawancara  : ");
            nilaiWawancara = input.nextDouble();
            AndroidDev AD = new AndroidDev();
            AD.setNilaiCoding(nilaiCoding);
            AD.setNilaiTulis(nilaiTulis);
            AD.setNilaiWawancara(nilaiWawancara);
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
            WebDev WD = new WebDev();
            WD.setNilaiCoding(nilaiCoding);
            WD.setNilaiTulis(nilaiTulis);
            WD.setNilaiWawancara(nilaiWawancara);
        }
        
            
        
    }
    static void tampil(int opsiDev){
        if (opsiDev == 1){
            AndroidDev AD = new AndroidDev();
            double hasil = AD.hasilAkhir();
            if (AD.hasilAkhir() >= 85){
                System.out.println(AD.getHasil());
                System.out.println("SELAMAT LOLOS");
            } else {
                System.out.println("MAAF " + AD.getNama()+ "TIDAK LOLOS");
            }
        } else {
            WebDev WD = new WebDev();
            
            
            if (WD.getHasil() >= 85){
                System.out.println("SELAMAT LOLOS");
            } else {
                System.out.println("MAAF TIDAK LOLOS");
            }
        }
        
            
        
    }
    static void subMenu(int opsiDev){
        int SubMenu;
        Scanner myOpsi = new Scanner(System.in);

        do{
            System.out.println("    Menu        ");
            System.out.println("    1. Edit");
            System.out.println("    2. Tampil");
            System.out.println("    3. Exit");
               System.out.println("    Pilih : ");
                        SubMenu = myOpsi.nextInt();
                        switch(SubMenu){
                            case 1:
                                editForm(opsiDev);
                            case 2:
                                tampil(opsiDev);
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
                    subMenu(opsiDev);
                    break;
                case 2:
                    inputForm(opsiDev);
                    subMenu(opsiDev);
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
