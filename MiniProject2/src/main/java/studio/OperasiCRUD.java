/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studio;

/**
 *
 * @author Hanna
 */

public interface OperasiCRUD {
    void tambahSesi(String namaKlien, String jenisSesi, String tanggalSesi, String lokasi);
    void tampilkanSemuaSesi();
    void updateSesi(String idSesi, String namaKlien, String jenisSesi, String tanggalSesi, String lokasi);
    void hapusSesi(String idSesi);
}
