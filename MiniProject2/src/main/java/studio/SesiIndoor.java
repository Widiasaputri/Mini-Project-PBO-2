/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studio;

/**
 *
 * @author Hanna
 */

public class SesiIndoor extends SesiFoto {
    private String lokasi;

    public SesiIndoor(String idSesi, String namaKlien, String tanggalSesi, String lokasi) {
        super(idSesi, namaKlien, tanggalSesi);
        this.lokasi = lokasi;
    }

    @Override
    public void deskripsiSesi() {
        System.out.println("Sesi foto indoor di lokasi: " + lokasi);
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}

