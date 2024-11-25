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

class Perpustakaan {
    private List<Buku> daftarBuku;
    
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    public void tampilkanSemuaBuku() {
        System.out.println("Daftar Buku di Perpustakaan: ");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.infoBuku());
        }
    }  
}
