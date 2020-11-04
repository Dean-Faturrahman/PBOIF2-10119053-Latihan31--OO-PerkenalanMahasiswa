/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan31.oo.perkenalanmahasiswa;

import data.Mahasiswa;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk perkenalan mahasiswa
 */
public class PBOIF210119053Latihan31OOPerkenalanMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama = "Dean Ghifari Faturrahman";
        mahasiswa1.perkenalanDiri();
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama = "Indra Tiola";
        mahasiswa2.perkenalanDiri();
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.perkenalanDiri();
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "10110273";
        mahasiswa4.nama = "Muhammad Nur Alaudin";
        mahasiswa4.perkenalanDiri();
    }
    
}
