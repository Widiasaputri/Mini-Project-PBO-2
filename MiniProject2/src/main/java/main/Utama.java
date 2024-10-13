/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import studio.Booking;
import java.util.Scanner;
/**
 *
 * @author Hanna
 */

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Booking booking = new Booking();
        int pilihan;

        do {
            System.out.println("=== Manajemen Studio Photo ===");
            System.out.println("1. Tambah Sesi Photo");
            System.out.println("2. Tampilkan Semua Sesi Photo");
            System.out.println("3. Update Sesi Photo");
            System.out.println("4. Hapus Sesi Photo");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama klien: ");
                    String namaKlien = scanner.nextLine();
                    System.out.print("Masukkan jenis sesi (indoor/outdoor): ");
                    String jenisSesi = scanner.nextLine();
                    System.out.print("Masukkan tanggal sesi (dd-mm-yyyy): ");
                    String tanggalSesi = scanner.nextLine();
                    System.out.print("Masukkan lokasi sesi: ");
                    String lokasi = scanner.nextLine();
                    booking.tambahSesi(namaKlien, jenisSesi, tanggalSesi, lokasi);
                    break;
                case 2:
                    booking.tampilkanSemuaSesi();
                    break;
                case 3:
                    System.out.print("Masukkan ID sesi yang ingin diupdate: ");
                    String idUpdate = scanner.nextLine();
                    System.out.print("Masukkan nama klien baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan jenis sesi baru: ");
                    String jenisBaru = scanner.nextLine();
                    System.out.print("Masukkan tanggal sesi baru (dd-mm-yyyy): ");
                    String tanggalBaru = scanner.nextLine();
                    System.out.print("Masukkan lokasi baru: ");
                    String lokasiBaru = scanner.nextLine();
                    booking.updateSesi(idUpdate, namaBaru, jenisBaru, tanggalBaru, lokasiBaru);
                    break;
                case 4:
                    System.out.print("Masukkan ID sesi yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    booking.hapusSesi(idHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}

