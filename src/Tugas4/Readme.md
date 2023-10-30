Tugas 2
java.time.LocalDate: Ini adalah kelas dalam pustaka Java Time API yang digunakan untuk mengelola tanggal.
java.time.Period: Ini adalah kelas yang digunakan untuk menghitung perbedaan antara dua tanggal dalam bentuk periode.
java.util.Scanner: Ini adalah kelas yang digunakan untuk menerima masukan dari pengguna melalui konsol.

kelas HitungUmur yang akan berisi metode main dan hitungUmur. Kelas ini berisi komentar Javadoc untuk memberikan dokumentasi tentang kelas dan metodenya.
Input tanggal lahir dari pengguna dibaca menggunakan scanner.next() dan disimpan dalam variabel tanggalLahirStr sebagai string.
Selanjutnya, string tanggalLahirStr dikonversi menjadi objek LocalDate menggunakan LocalDate.parse(tanggalLahirStr). Ini memungkinkan kita untuk melakukan operasi tanggal dengan objek tanggalLahir.
Objek tanggalSekarang diperoleh dengan menggunakan LocalDate.now(), yang memberikan tanggal saat ini.
menghitung umur, program memanggil metode hitungUmur dengan dua parameter, yaitu tanggalLahir dan tanggalSekarang.
Metode hitungUmur menghitung perbedaan antara tanggalLahir dan tanggalSekarang menggunakan Period.between(tanggalLahir, tanggalSekarang). Kemudian, ia mengambil tahun dari periode tersebut menggunakan periode.getYears().
erakhir, objek Scanner ditutup dengan scanner.close() untuk menghindari kebocoran sumber day
tes