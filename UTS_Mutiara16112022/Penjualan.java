/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Mutiara16112022;

/**
 *
 * @author Mutiara Maharani
 */
public class Penjualan {
    private String noFaktur;
    private String tanggal;
    private String namaPelanggan;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    private double total;
    private double diskon;
    private double totalBayar;

    public Penjualan(String string, String vandi, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Penjualan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public double getDiskon() {
        return diskon;
    }
    
    public double total() {
        return total;
    }
    
    
    public double getTotalBayar() {
        return totalBayar;
    }

    public void setNilai(String NoFaktur,String Tanggal, String NamaPelanggan, String NamaBarang, int HargaBarang, int JumlahBarang, double Diskon, double Pajak, double TotalBayar) {
        this.noFaktur = NoFaktur;
        this.tanggal = Tanggal;
        this.namaPelanggan = NamaPelanggan;
        this.namaBarang = NamaBarang;
        this.hargaBarang = HargaBarang;
        this.jumlahBarang = JumlahBarang ;
        this.total= total;
        this.diskon = Diskon;
        this.totalBayar = TotalBayar;
    }
}
