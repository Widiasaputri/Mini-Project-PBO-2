# NAMA: WIDIA SAPUTRI
# NIM: 2309116019
# KELAS: A1
## MANAJEMEN PHOTO STUDIO

## Dokumentasi Program Manajemen Studio Foto

## Deskripsi Umum
Program ini dirancang untuk membantu pengelolaan sebuah studio foto dengan fitur-fitur yang memungkinkan pengguna untuk menambah, menampilkan, memperbarui, dan menghapus sesi foto secara efisien. Dengan adanya program ini, proses manajemen sesi foto menjadi lebih mudah dan terorganisir, memungkinkan pengguna untuk melacak semua informasi yang relevan dengan lebih baik. Program ini bertujuan untuk meningkatkan efisiensi operasional studio serta mengurangi kemungkinan kesalahan dalam pencatatan data, sehingga pengelolaan sesi foto dapat dilakukan dengan lebih akurat dan efektif.

## Struktur Proyek
Proyek ini terdiri dari dua package utama:

### 1. Package main
Package ini berisi kelas utama yang mengelola interaksi pengguna dengan aplikasi.

#### Kelas: Utama
**Fungsi:** Kelas ini berfungsi sebagai titik masuk aplikasi dan mengatur antarmuka pengguna berbasis konsol.

**Metode Utama:**
- `public static void main(String[] args)`: Metode ini menjalankan loop menu utama dan menangani input pengguna untuk berbagai operasi CRUD.

### 2. Package studio
Package ini berisi kelas-kelas yang mengimplementasikan logika bisnis dan struktur data untuk sistem manajemen studio foto.

#### Kelas Abstrak: SesiFoto
**Fungsi:** Kelas abstrak ini menyediakan struktur dasar untuk sesi foto.

**Atribut:**
- `private final String idSesi`: ID unik sesi foto (menggunakan keyword final).
- `private String namaKlien`: Nama klien.
- `private String tanggalSesi`: Tanggal sesi foto.

**Metode:**
- Getter dan setter untuk atribut.
- `public String getInfoSesi()`: Mengembalikan informasi lengkap tentang sesi foto.
- `public abstract void deskripsiSesi()`: Metode abstrak yang harus diimplementasikan oleh subclass.

#### Kelas: SesiIndoor (extends SesiFoto)
**Fungsi:** Merepresentasikan sesi foto indoor.

**Atribut Tambahan:**
- `private String lokasi`: Lokasi sesi foto indoor.

**Metode:**
- `@Override public void deskripsiSesi()`: Implementasi untuk mendeskripsikan sesi foto indoor.

#### Kelas: SesiOutdoor (extends SesiFoto)
**Fungsi:** Merepresentasikan sesi foto outdoor.

**Atribut Tambahan:**
- `private String lokasi`: Lokasi sesi foto outdoor.

**Metode:**
- `@Override public void deskripsiSesi()`: Implementasi untuk mendeskripsikan sesi foto outdoor.

#### Interface: OperasiCRUD
**Fungsi:** Mendefinisikan operasi CRUD standar untuk manajemen sesi foto.

**Metode:**
- `void tambahSesi(String namaKlien, String jenisSesi, String tanggalSesi, String lokasi)`
- `void tampilkanSemuaSesi()`
- `void updateSesi(String idSesi, String namaKlien, String jenisSesi, String tanggalSesi, String lokasi)`
- `void hapusSesi(String idSesi)`

#### Kelas: Booking (implements OperasiCRUD)
**Fungsi:** Mengimplementasikan operasi CRUD untuk manajemen sesi foto.

**Atribut:**
- `private static int idCounter`: Penghitung untuk menghasilkan ID sesi unik.
- `private ArrayList<SesiFoto> daftarSesi`: Menyimpan daftar objek SesiFoto.

**Metode:**
- Implementasi semua metode dari interface OperasiCRUD.

## Implementasi Konsep OOP
1. **Abstraksi**: Kelas `SesiFoto` adalah kelas abstrak dengan metode abstrak `deskripsiSesi()`.
2. **Interface**: `OperasiCRUD` mendefinisikan kontrak untuk operasi CRUD.
3. **Inheritance**: `SesiIndoor` dan `SesiOutdoor` mewarisi dari `SesiFoto`.
4. **Encapsulation**: Penggunaan modifier akses private dan metode getter/setter.
5. **Final Keyword**: Digunakan pada `idSesi` di `SesiFoto` untuk mencegah perubahan setelah inisialisasi.

## Fitur Utama
1. Menambahkan sesi foto baru (indoor atau outdoor).
2. Menampilkan semua sesi foto yang ada.
3. Memperbarui informasi sesi foto yang ada.
4. Menghapus sesi foto berdasarkan ID.

## Antarmuka Pengguna
Sistem menggunakan antarmuka berbasis konsol dengan menu pilihan untuk melakukan berbagai operasi. Pengguna dapat memilih opsi dari 1 hingga 5 untuk melakukan operasi yang diinginkan atau keluar dari program.

## Kesimpulan
Sistem Manajemen Studio Foto ini mendemonstrasikan penggunaan prinsip-prinsip OOP dalam Java untuk menciptakan aplikasi yang terstruktur dan mudah dipelihara. Dengan menggunakan abstraksi, inheritance, dan interface, sistem ini menyediakan fondasi yang kuat untuk pengembangan lebih lanjut dan penambahan fitur di masa depan.

## OUTPUT
1. Menu Utama

![menu utama](https://github.com/user-attachments/assets/dd0bad39-22d8-4710-8e0e-c0ed376a00b8)

2.	Pilih opsi dari menu:
-	Tambah sesi foto

![opsi 1](https://github.com/user-attachments/assets/cfe80017-ef31-407f-a833-450cbf5bccb9)

Lalu kembali ke Menu Utama.
-	Tampilkan semua sesi foto

![opsi 2](https://github.com/user-attachments/assets/f7965b71-fdda-464c-8735-f762f3ecfbe3)

Lalu kembali ke Menu Utama.
-	Perbarui sesi foto

![opsi 3](https://github.com/user-attachments/assets/bf69c435-ed67-473b-8a0f-9bb9a09e0d2d)

Lalu kembali ke Menu Utama.
Hasil setelah diperbarui
 
![opsi 3-2](https://github.com/user-attachments/assets/641cdd88-582b-4ef5-8a4c-a59426c61214)

Lalu kembali ke Menu Utama.
-	Hapus sesi foto

![opsi 4](https://github.com/user-attachments/assets/4fbbe989-c72d-4217-9308-73208ee7d22f)

Lalu kembali ke Menu Utama.
Hasil setelah dihapus

![opsi 4-2](https://github.com/user-attachments/assets/a8364be3-caff-4dfb-b6dc-afcc6de272ab)

-	Keluar dari aplikasi

![opsi 5](https://github.com/user-attachments/assets/630688c3-c2c2-4cbe-8f1e-e505c328c686)


Selesai.
-	Apabila opsi tidak tersedia

![opsi tidak ada](https://github.com/user-attachments/assets/27ac6023-1172-4fb5-98c3-997f1a314b27)

Lalu kembali ke Menu Utama.
