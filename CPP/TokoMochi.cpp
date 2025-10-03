#include "TokoMochi.h"
#include <iostream>
#include <iomanip>
using namespace std;

TokoMochi::TokoMochi(string k, string n, string p) : kodeToko(k), namaToko(n), pemilik(p) {}

void TokoMochi::tambahBasah(MochiBasah m) { daftarBasah.push_back(m); }
void TokoMochi::tambahKering(MochiKering m) { daftarKering.push_back(m); }

void TokoMochi::tampilkanProduk() {
    cout << "\n=== DATA TOKO MOCHI ===\n";
    cout << "Kode Toko : " << kodeToko << endl;
    cout << "Nama Toko : " << namaToko << endl;
    cout << "Pemilik   : " << pemilik << endl << endl;

    if (!daftarBasah.empty()) {
        cout << "Daftar Mochi Basah:\n";
        cout << "+------+----------------+--------+----------+----------+---------+\n";
        cout << "| " << setw(4) << left << "Kode"
             << " | " << setw(14) << "Nama"
             << " | " << setw(6) << "Harga"
             << " | " << setw(8) << "Isian"
             << " | " << setw(8) << "Ukuran"
             << " | " << setw(7) << "Warna" << " |\n";
        cout << "+------+----------------+--------+----------+----------+---------+\n";
        for (auto &m : daftarBasah) {
            cout << "| " << setw(4) << left << m.getKode()
                 << " | " << setw(14) << m.getNama()
                 << " | " << setw(6) << m.getHarga()
                 << " | " << setw(8) << m.getIsian()
                 << " | " << setw(8) << m.getUkuran()
                 << " | " << setw(7) << m.getWarna() << " |\n";
        }
        cout << "+------+----------------+--------+----------+----------+---------+\n\n";
    }

    if (!daftarKering.empty()) {
        cout << "Daftar Mochi Kering:\n";
        cout << "+------+----------------+--------+----------+------------+----------+\n";
        cout << "| " << setw(4) << left << "Kode"
             << " | " << setw(14) << "Nama"
             << " | " << setw(6) << "Harga"
             << " | " << setw(8) << "Rasa"
             << " | " << setw(10) << "DayaTahan"
             << " | " << setw(8) << "Kemasan" << " |\n";
        cout << "+------+----------------+--------+----------+------------+----------+\n";
        for (auto &m : daftarKering) {
            cout << "| " << setw(4) << left << m.getKode()
                 << " | " << setw(14) << m.getNama()
                 << " | " << setw(6) << m.getHarga()
                 << " | " << setw(8) << m.getRasa()
                 << " | " << setw(10) << m.getDayaTahan()
                 << " | " << setw(8) << m.getKemasan() << " |\n";
        }
        cout << "+------+----------------+--------+----------+------------+----------+\n\n";
    }
}
