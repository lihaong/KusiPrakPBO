/*d
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormPendaftaran;

/**
 *
 * @author mfaja
 */
public class AndroidDev implements HitungNilai{

    private String NIK, Nama;
    private double nilaiTulis, nilaiCoding, nilaiWawancara;
    double nilai;

 

    public String getNama() {
        return this.Nama;
    }
    
    public AndroidDev(String nama , double nilaiTulis, double nilaiCoding, double nilaiWawancara){
        this.Nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    
    public AndroidDev(String NIK, String Nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }

    @Override
    public double pembobotanNilaiTulis() {
        double nilaiAkhir = this.nilaiTulis * 20 / 100;
        return nilaiAkhir;
    }

    @Override
    public double pembobotanNilaiCoding() {
        double nilaiAkhir = this.nilaiCoding * 50 / 100;
        return nilaiAkhir;
    }

    @Override
    public double pembobotanNilaiWawancara() {
        double nilaiAkhir = this.nilaiWawancara * 30 / 100;
        return nilaiAkhir;

    }

    @Override
    public double hasilAkhir() {
        this.nilai = pembobotanNilaiTulis() + pembobotanNilaiCoding() + pembobotanNilaiWawancara();
        return this.nilai;
    }
    
    public double getHasil() {
        return this.nilai;
    }
    
    
}
