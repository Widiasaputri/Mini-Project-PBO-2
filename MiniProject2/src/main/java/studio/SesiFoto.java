/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studio;

/**
 *
 * @author Hanna
 */
public abstract class SesiFoto {
    private final String idSesi; 
    private String namaKlien;
    private String tanggalSesi;

    public SesiFoto(String idSesi, String namaKlien, String tanggalSesi) {
        this.idSesi = idSesi;
        this.namaKlien = namaKlien;
        this.tanggalSesi = tanggalSesi;
    }

    public String getIdSesi() {
        return idSesi;
    }

    public String getNamaKlien() {
        return namaKlien;
    }

    public void setNamaKlien(String namaKlien) {
        this.namaKlien = namaKlien;
    }

    public String getTanggalSesi() {
        return tanggalSesi;
    }

    public void setTanggalSesi(String tanggalSesi) {
        this.tanggalSesi = tanggalSesi;
    }

    public String getInfoSesi() {
        return "ID Sesi: " + idSesi + "\nNama Klien: " + namaKlien + "\nTanggal Sesi: " + tanggalSesi;
    }

    public abstract void deskripsiSesi();
}

