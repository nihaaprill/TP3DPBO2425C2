#include "CabangToko.h"
#include <iostream>
using namespace std;

int main() {
    CabangToko cabang("T001", "Mochi Garut", "Budi", "Garut", 1999, "Reseller");

    // Produk awal
    cabang.tambahBasah(MochiBasah("MB01", "Mochi Stroberi", 5000, "Stroberi", "Kecil", "Merah"));
    cabang.tambahBasah(MochiBasah("MB02", "Mochi Kacang", 6000, "Kacang", "Sedang", "Coklat"));
    cabang.tambahKering(MochiKering("MK01", "Mochi Susu", 8000, "Susu", "7 Hari", "Kotak"));
    cabang.tambahKering(MochiKering("MK02", "Mochi Coklat", 10000, "Coklat", "10 Hari", "Plastik"));

    bool jalan = true;
    while (jalan) {
        cout << "\n=== SISTEM TOKO MOCHI ===\n";
        cout << "1. Tambah Mochi Basah\n";
        cout << "2. Tambah Mochi Kering\n";
        cout << "3. Tampilkan Data\n";
        cout << "4. Cetak Laporan Cabang\n";
        cout << "0. Keluar\n";
        cout << "Pilih menu: ";

        string pilih;
        getline(cin, pilih);

        if (pilih == "1") {
            string kode, nama, isian, ukuran, warna;
            int harga;
            cout << "Kode: "; getline(cin, kode);
            cout << "Nama: "; getline(cin, nama);
            cout << "Harga: "; cin >> harga; cin.ignore();
            cout << "Isian: "; getline(cin, isian);
            cout << "Ukuran: "; getline(cin, ukuran);
            cout << "Warna: "; getline(cin, warna);
            cabang.tambahBasah(MochiBasah(kode, nama, harga, isian, ukuran, warna));
            cout << "Mochi Basah berhasil ditambahkan!\n";
        }
        else if (pilih == "2") {
            string kode, nama, rasa, daya, kemasan;
            int harga;
            cout << "Kode: "; getline(cin, kode);
            cout << "Nama: "; getline(cin, nama);
            cout << "Harga: "; cin >> harga; cin.ignore();
            cout << "Rasa: "; getline(cin, rasa);
            cout << "Daya Tahan: "; getline(cin, daya);
            cout << "Kemasan: "; getline(cin, kemasan);
            cabang.tambahKering(MochiKering(kode, nama, harga, rasa, daya, kemasan));
            cout << "Mochi Kering berhasil ditambahkan!\n";
        }
        else if (pilih == "3") {
            cabang.tampilkanData();
            cabang.tampilkanProduk();
        }
        else if (pilih == "4") {
            cabang.laporan();
        }
        else if (pilih == "0") {
            cout << "Keluar program...\n";
            jalan = false; 
        }
        else {
            cout << "Menu tidak valid!\n";
        }
    }

    return 0;
}
