package Tugas2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * @NamaKelas HitungUmur
 * @author farrel
 */
public class HitungUmur {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tanggal lahir Anda (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        // Mengonversi masukan pengguna ke LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);
        LocalDate tanggalSekarang = LocalDate.now();

        int umur = hitungUmur(tanggalLahir, tanggalSekarang);

        System.out.println("Umur Anda: " + umur + " tahun");

        scanner.close();
    }

    /**
     * @NamaKelas Tugas2.HitungUmur
     * @method main, int
     */

    // Metode untuk menghitung umur
    public static int hitungUmur(LocalDate tanggalLahir, LocalDate tanggalSekarang) {
        Period periode = Period.between(tanggalLahir, tanggalSekarang);
        return periode.getYears();
    }
}
