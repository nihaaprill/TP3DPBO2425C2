#include "CabangToko.h"
#include <iostream>
using namespace std;

CabangToko::CabangToko(string k, string n, string p, string l, int t, string j)
    : TokoMochi(k, n, p), lokasi(l), tahun(t), jenis(j) {}

void CabangToko::tampilkanData() {
    cout << "\n=== DATA CABANG TOKO MOCHI ===\n";
    cout << "Kode Toko   : " << kodeToko << endl;
    cout << "Nama Toko   : " << namaToko << endl;
    cout << "Pemilik     : " << pemilik << endl;
    cout << "Lokasi      : " << lokasi << endl;
    cout << "Tahun       : " << tahun << endl;
    cout << "Jenis Usaha : " << jenis << endl << endl;
}

void CabangToko::laporan() {
    tampilkanData();
    tampilkanProduk();
}
