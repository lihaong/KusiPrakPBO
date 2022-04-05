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
    private double Hasil;
    double nilai;

    

    public void setNilaiTulis(double nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public void setNilaiCoding(double nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public void setNilaiWawancara(double nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }

    public String getNama() {
        return Nama;
    }
    
    public AndroidDev(){
        
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
        nilai = pembobotanNilaiTulis() + pembobotanNilaiCoding() + pembobotanNilaiWawancara();
        return nilai;
    }
    
    public double getHasil() {
        return nilai;
    }
    
    
}
