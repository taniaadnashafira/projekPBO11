/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_soal;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Luluk");
        Pengarang pengarang2 = new Pengarang("Itakrn");
        
        Buku buku1 = new Buku("Mariposa", pengarang1);
        Buku buku2 = new Buku("Eccedentesiast", pengarang2);
        Buku buku3 = new Buku("Lavender");
        
        Perpustakaan perpustakaan = new Perpustakaan();
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        perpustakaan.tampilkanSemuaBuku();
    }  
}
