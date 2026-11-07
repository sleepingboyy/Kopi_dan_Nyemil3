# ☕ Kopi & Nyemil - Aplikasi Pemesanan Kopi & Camilan

**Kopi & Nyemil** adalah aplikasi mobile berbasis Android modern untuk memesan aneka minuman kopi dan camilan lezat secara langsung dari perangkat Android. Aplikasi ini dibangun menggunakan **Kotlin** dan **Jetpack Compose (Material 3)**.

---

## 📌 Fitur Utama

1. **Splash / Welcome Screen**  
   - Layar sambutan awal yang menampilkan logo, tagline, serta tombol akses cepat ke Login dan Register.

2. **Autentikasi (Login & Register / Sign Up)**  
   - Layar **Login** untuk masuk ke aplikasi.
   - Layar **Register / Sign Up** untuk pendaftaran akun baru.

3. **Katalog Menu Utama (Home Screen)**  
   - Menampilkan daftar hidangan (kopi, non-kopi, dan nyemil/camilan) dengan minimal 6 pilihan item.
   - Dilengkapi harga, rating, kategori, dan deskripsi singkat item.

4. **Alamat Pengiriman (Address Screen)**  
   - Penginputan alamat pengiriman lengkap, catatan khusus untuk kurir, serta opsi pilihan metode pembayaran (**QRIS** / **Cash COD**).

5. **Konfirmasi Pesanan (Order Confirmation Screen)**  
   - Ringkasan item pesanan dinamis, total pembayaran, alamat pengiriman, dan tombol penyelesaian pesanan.

6. **Profil Pengguna & Riwayat Pesanan (Profile Screen)**  
   - Informasi profil pengguna (Nama, NIM, Jurusan/Instansi).
   - Menampilkan **Riwayat Pesanan Terakhir** yang terupdate secara dinamis dari setiap transaksi yang berhasil dilakukan.

7. **Navigasi Bawah (Bottom Navigation)**  
   - Memudahkan perpindahan antara halaman **Beranda** dan **Profil**.

---

## 🛠 Teknologi & Library yang Digunakan

- **Bahasa Pemrograman**: Kotlin
- **UI Framework**: Jetpack Compose (Material 3)
- **Navigation**: Jetpack Navigation Compose
- **Design System**: Material Design 3 (`androidx.compose.material3`)
- **Build System**: Gradle Version Catalog (`libs.versions.toml`)
- **Target SDK**: Android 15 (API Level 35/37)

---

## 🚀 Cara Menjalankan Aplikasi

1. **Prasyarat**:
   - Install **Android Studio** versi terbaru (misal: Android Studio Ladybug/2024.2+).
   - JDK 11 atau lebih baru.
   - Android Emulator atau Perangkat Fisik (Min SDK: 27 / Android 8.1+).

2. **Langkah-Langkah**:
   - Clone repository ini ke komputer Anda:
     ```bash
     git clone https://github.com/username/KopidanNyemil.git
     ```
   - Buka Android Studio dan pilih **Open**, lalu pilih folder proyek `KopidanNyemil`.
   - Tunggu hingga proses **Gradle Sync** selesai.
   - Jalankan aplikasi dengan menekan tombol **Run** (`Shift + F10`) pada emulator atau perangkat fisik Android yang terhubung.

---

## 📱 Dokumentasi Tampilan Aplikasi (Screenshots)

| Welcome / Splash | Login | Register |
| :---: | :---: | :---: |
| Welcome Screen | Login Screen | Register Screen |

| Home (Menu) | Alamat Pengiriman | Konfirmasi Pesanan | Profil & Riwayat |
| :---: | :---: | :---: | :---: |
| Katalog Menu | Form Alamat & Pembayaran | Ringkasan Order | Profil & History |

---

## 👨‍💻 Pengembang

- **Nama**: Sekarmaji Hukman Adala Hamdani
- **NIM**: 1247050124
- **Program Studi**: Teknik Informatika - UIN Sunan Gunung Djati Bandung
