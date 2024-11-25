/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_soal;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;
    private Pengarang pengarang;
    
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public Buku(String judul) {
        this.judul = judul;
        this.pengarang = null;
    }
    public String infoBuku() {
        if (pengarang != null) {
            return "Buku: " + judul +", " + pengarang.infoPengarang();
        }else{
            return "Buku: " + judul + ", Pengarang: Tidak Diketahui";
        }
    }
}
