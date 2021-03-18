/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2dpbo;

/**
 *
 * @author REPUBLIC OF GAMERS
 */
public class Mobil {
    // atribut pada kelas Mobil
    private String merk; //merk
    private String plat; //plat
    private String warna; //warna
    private String jenis; //jenis
    
    // konstruktor Mobil untuk mengeset langsung value atribut sejak instansiasi objek
    Mobil(String merk, String plat, String warna, String jenis){
        this.merk = merk; //mengisi value atribut merk
        this.plat = plat; //mengisi value atribut plat
        this.warna = warna; //mengisi value atribut warna
        this.jenis = jenis; //mengisi value atribut jenis
    }
    
    // prosedur untuk mengeset atribut merk
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    // prosedur untuk mendapatkan nilai dari atribut merk
    public String getMerk(){
        return this.merk;
    }
    
    // prosedur untuk mengeset atribut plat
    public void setPlat(String plat){
        this.plat = plat;
    }
    
    // prosedur untuk mendapatkan nilai dari atribut plat
    public String getPlat(){
        return this.plat;
    }
    
    // prosedur untuk mengeset atribut warna
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    // prosedur untuk mendapatkan nilai dari atribut warna
    public String getWarna(){
        return this.warna;
    }
    
    // prosedur untuk mengeset atribut jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    // prosedur untuk mendapatkan nilai dari atribut jenis
    public String getJenis(){
        return this.jenis;
    }
}
