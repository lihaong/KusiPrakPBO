/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormPendaftaran;

/**
 *
 * @author mfaja
 */
public class WebDev implements HitungNilai{

    private String NIK, Nama;
    private double nilaiTulis, nilaiCoding, nilaiWawancara;
    private double Hasil;

    public double getHasil() {
        return Hasil;
    }

    public String getNama() {
        return Nama;
    }
    

    public void setNilaiTulis(double nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public void setNilaiCoding(double nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public void setNilaiWawancara(double nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }
    
    public WebDev(String NIK, String Nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    public WebDev(){
        
    }

    @Override
    public double pembobotanNilaiTulis() {
        double nilaiAkhir = this.nilaiTulis * 40 / 100;
        return nilaiAkhir;
    }

    @Override
    public double pembobotanNilaiCoding() {
        double nilaiAkhir = this.nilaiCoding * 35 / 100;
        return nilaiAkhir;
    }

    @Override
    public double pembobotanNilaiWawancara() {
        double nilaiAkhir = this.nilaiWawancara * 25 / 100;
        return nilaiAkhir;
    }
    
    @Override
    public double hasilAkhir() {
        return Hasil = pembobotanNilaiTulis() + pembobotanNilaiCoding() + pembobotanNilaiWawancara();
        
    }
}
