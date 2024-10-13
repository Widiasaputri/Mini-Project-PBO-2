/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studio;
import java.util.ArrayList;
/**
 *
 * @author Hanna
 */

public class Booking implements OperasiCRUD {
    private static int idCounter = 1;
    private ArrayList<SesiFoto> daftarSesi = new ArrayList<>();

    @Override
    public void tambahSesi(String namaKlien, String jenisSesi, String tanggalSesi, String lokasi) {
        String idSesi = "S-" + idCounter++;
        SesiFoto sesi;
        if (jenisSesi.equalsIgnoreCase("indoor")) {
            sesi = new SesiIndoor(idSesi, namaKlien, tanggalSesi, lokasi);
        } else {
            sesi = new SesiOutdoor(idSesi, namaKlien, tanggalSesi, lokasi);
        }
        daftarSesi.add(sesi);
        System.out.println("Sesi berhasil ditambahkan dengan ID: " + idSesi);
    }

    @Override
    public void tampilkanSemuaSesi() {
        if (daftarSesi.isEmpty()) {
            System.out.println("Tidak ada sesi tersedia.");
        } else {
            for (SesiFoto sesi : daftarSesi) {
                System.out.println(sesi.getInfoSesi());
                sesi.deskripsiSesi();
                System.out.println("---------------------------");
            }
        }
    }

    @Override
    public void updateSesi(String idSesi, String namaKlien, String jenisSesi, String tanggalSesi, String lokasi) {
        for (SesiFoto sesi : daftarSesi) {
            if (sesi.getIdSesi().equals(idSesi)) {
                sesi.setNamaKlien(namaKlien);
                sesi.setTanggalSesi(tanggalSesi);
                if (sesi instanceof SesiIndoor) {
                    ((SesiIndoor) sesi).setLokasi(lokasi);
                } else if (sesi instanceof SesiOutdoor) {
                    ((SesiOutdoor) sesi).setLokasi(lokasi);
                }
                System.out.println("Sesi dengan ID " + idSesi + " berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Sesi dengan ID " + idSesi + " tidak ditemukan.");
    }

    @Override
    public void hapusSesi(String idSesi) {
        SesiFoto sesiDihapus = null;
        for (SesiFoto sesi : daftarSesi) {
            if (sesi.getIdSesi().equals(idSesi)) {
                sesiDihapus = sesi;
                break;
            }
        }
        if (sesiDihapus != null) {
            daftarSesi.remove(sesiDihapus);
            System.out.println("Sesi dengan ID " + idSesi + " berhasil dihapus.");
        } else {
            System.out.println("Sesi dengan ID " + idSesi + " tidak ditemukan.");
        }
    }
}

